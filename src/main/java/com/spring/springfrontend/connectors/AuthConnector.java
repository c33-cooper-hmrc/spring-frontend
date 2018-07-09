package com.spring.springfrontend.connectors;

import com.spring.springfrontend.config.ServicesConfig;
import org.springframework.stereotype.Component;

@Component
public class AuthConnector {

    private final String BACKEND_HTTP_PROTOCOL;
    private final String BACKEND_HOST;
    private final String BACKEND_PORT;

    private ServicesConfig servicesConfig;

    public AuthConnector(ServicesConfig servicesConfig) {
        this.servicesConfig = servicesConfig;

        this.BACKEND_HTTP_PROTOCOL = servicesConfig.getServiceProtocol("spring-backend");
        this.BACKEND_HOST = servicesConfig.getServiceHost("spring-backend");
        this.BACKEND_PORT = servicesConfig.getServicePort("spring-backend");
    }

    public String getAuthURI() {
        return BACKEND_HTTP_PROTOCOL + "://" + BACKEND_HOST + ":" + BACKEND_PORT;
    }
}
