package com.spring.springfrontend.connectors;

import com.spring.springfrontend.config.ServicesConfig;
import com.spring.springfrontend.utils.ConfigUtils;
import com.spring.springfrontend.utils.LoggerUtils;
import org.springframework.stereotype.Component;

@Component
public class AuthConnector {

    // Class dependencies
    private ServicesConfig servicesConfig;
    private ConfigUtils configUtils;
    private LoggerUtils loggerUtils;

    // Class field attributes
    private final String BACKEND_HTTP_PROTOCOL;
    private final String BACKEND_HOST;
    private final String BACKEND_PORT;

    public AuthConnector(ServicesConfig servicesConfig, ConfigUtils configUtils, LoggerUtils loggerUtils) {
        this.servicesConfig = servicesConfig;
        this.configUtils = configUtils;
        this.loggerUtils = loggerUtils;

        this.BACKEND_HTTP_PROTOCOL = servicesConfig.getServiceProtocol("spring-backend");
        this.BACKEND_HOST = servicesConfig.getServiceHost("spring-backend");
        this.BACKEND_PORT = servicesConfig.getServicePort("spring-backend");

        loggerUtils.setLogger(AuthConnector.class);
    }

    private String getAuthURI(String endpoint) {
        loggerUtils.getLogger().info("Is the BACKEND_HTTP_PROTOCOL defined in config? : " + configUtils.isServiceHttpProtocolDefined(BACKEND_HTTP_PROTOCOL) +
                "\nIs the BACKEND_HOST defined in config? : " + configUtils.isServiceHttpHostDefined(BACKEND_HOST) +
                "\nIs the BACKEND_PORT defined in config? : " + configUtils.isServiceHttpPortDefined(BACKEND_PORT));

        if (configUtils.isServiceHttpPortDefined(BACKEND_PORT)) {
            return BACKEND_HTTP_PROTOCOL + "://" + BACKEND_HOST + ":" + BACKEND_PORT + endpoint;
        }
        else {
            return BACKEND_HTTP_PROTOCOL + "://" + BACKEND_HOST + endpoint;
        }
    }
}
