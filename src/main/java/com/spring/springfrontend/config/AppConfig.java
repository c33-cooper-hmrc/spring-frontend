package com.spring.springfrontend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class AppConfig extends ConfigSkeleton {

    @Value("${spring.application.name}")
    protected String appName;

    public AppConfig(Environment environment) {
        super(environment);
    }

    public String getAppName() {
        return this.appName;
    }

    public String getEnvName() {
        return getConfigString(".envName", "unknown_environment");
    }
}