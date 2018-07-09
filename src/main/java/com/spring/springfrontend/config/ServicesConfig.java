package com.spring.springfrontend.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class ServicesConfig extends ConfigSkeleton {

    public ServicesConfig(Environment environment) {
        super(environment);
    }

    public String getServiceHost(String serviceName) {
        return getConfigString(".services." + serviceName + ".http" + ".host", "unknown_host");
    }

    public String getServicePort(String serviceName) {
        return getConfigString(".services." + serviceName + ".http" + ".port", "unknown_port");
    }

    public String getServiceProtocol(String serviceName) {
        return getConfigString(".services." + serviceName + ".http" + ".protocol", "unknown_http_protocol");
    }

}
