package com.microsoft.bingads;

import jakarta.ws.rs.client.ClientBuilder;

public class HttpClientProviderFactory {

    private HttpClientProviderFactory() {
        // no instantiation necessary
    }

    public static HttpClientProvider getHttpClientProvider() {
        ClientBuilder clientBuilder = ClientBuilder.newBuilder();
        if (clientBuilder.getClass().getName().contains("org.apache.cxf")) {
            return new CxfHttpClientProvider(clientBuilder);
        } else if (clientBuilder.getClass().getName().contains("org.glassfish.jersey")) {
            return new JerseyHttpClientProvider(clientBuilder);
        }
        return new HttpClientProvider(clientBuilder);
    }
}