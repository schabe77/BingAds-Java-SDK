package com.microsoft.bingads;

import jakarta.ws.rs.client.ClientBuilder;

public class JerseyHttpClientProvider extends HttpClientProvider {

    protected JerseyHttpClientProvider(ClientBuilder clientBuilder) {
        super(configureClientBuilder(clientBuilder));
    }

    private static ClientBuilder configureClientBuilder(ClientBuilder clientBuilder) {
        // allow DELETE requests with body
        return clientBuilder.property("jersey.config.client.suppressHttpComplianceValidation", true);
    }
}