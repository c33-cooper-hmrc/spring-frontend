package com.spring.springfrontend.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class AppConfig extends ConfigSkeleton {

    public AppConfig(Environment environment) {
        super(environment);
    }

    protected String getAppName() {
        return this.appName;
    }

    public String getEnvName() {
        return getConfigString(".envName", "unknown_environment");
    }
}