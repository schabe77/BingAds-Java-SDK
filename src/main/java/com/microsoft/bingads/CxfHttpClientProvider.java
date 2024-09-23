package com.microsoft.bingads;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.cxf.transport.common.gzip.GZIPFeature;

import com.microsoft.bingads.internal.CxfUtils;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;

public class CxfHttpClientProvider extends HttpClientProvider {

    protected CxfHttpClientProvider(ClientBuilder clientBuilder) {
        super(configureClientBuilder(clientBuilder), CxfHttpClientProvider::createWebTargets);
    }

    private static ClientBuilder configureClientBuilder(ClientBuilder clientBuilder) {
        return clientBuilder.register(new GZIPFeature());
    }

    private static Map<String, WebTarget> createWebTargets(Client client) {
        return CxfUtils.runOnNewBus(
                () -> initializeWebTargets(client),
                logging -> {
                    Set<String> headerNames = new HashSet<>();

                    headerNames.add("Authorization");
                    headerNames.add("Password");

                    logging.setSensitiveProtocolHeaderNames(headerNames);
                });
    }
}