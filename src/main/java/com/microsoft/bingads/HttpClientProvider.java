package com.microsoft.bingads;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.microsoft.bingads.internal.ServiceFactoryImpl;
import com.microsoft.bingads.internal.ServiceInfo;
import com.microsoft.bingads.internal.ServiceUtils;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;

public class HttpClientProvider {
    private final Client client;
    private final Map<String, WebTarget> webTargetByService;

    HttpClientProvider(ClientBuilder clientBuilder) {
        this(clientBuilder, HttpClientProvider::initializeWebTargets);
    }

    HttpClientProvider(ClientBuilder clientBuilder, Function<Client, Map<String, WebTarget>> webTargetByServiceFunction) {
        client = clientBuilder.connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(10, TimeUnit.MINUTES)
                .build();
        webTargetByService = webTargetByServiceFunction.apply(client);
    }

    public WebTarget get(Class<?> serviceInterface, ApiEnvironment environment) {
        String key = getKey(serviceInterface, environment);
        return webTargetByService.get(key);
    }

    protected void close() {
        client.close();
    }

    private static String getKey(Class<?> serviceInterface, ApiEnvironment environment) {
        return serviceInterface.getName() + "_" + environment.toString();
    }

    protected static Map<String, WebTarget> initializeWebTargets(Client client) {
        Map<String, WebTarget> webTargets = new HashMap<>();

        for (ApiEnvironment environment : Arrays.asList(ApiEnvironment.PRODUCTION, ApiEnvironment.SANDBOX)) {
            for (Map.Entry<Class<?>, ServiceInfo> endpoint : ServiceFactoryImpl.endpoints.entrySet()) {
                Class<?> serviceInterface = endpoint.getKey();

                ServiceInfo serviceInfo = endpoint.getValue();

                String serviceUrl = ServiceUtils.getServiceUrlFromConfig(serviceInterface);

                if (serviceUrl == null) {
                    serviceUrl = serviceInfo.GetUrl(environment);
                }

                URL soapUrl;
                try {
                    soapUrl = new URL(serviceUrl);
                } catch (MalformedURLException e) {
                    throw new InternalException(e);
                }

                String restUrl = soapUrl.getProtocol() + "://" + soapUrl.getAuthority() + "/" + serviceInfo.getServiceNameAndVersion();

                String key = getKey(serviceInterface, environment);

                WebTarget webTarget = client.target(restUrl);

                webTarget.request();

                webTargets.put(key, webTarget);
            }
        }

        return webTargets;
    }
}