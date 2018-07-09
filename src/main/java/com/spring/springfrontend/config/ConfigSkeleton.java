package com.spring.springfrontend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

public class ConfigSkeleton {

    @Autowired
    protected Environment environment;

    @Value("${spring.profiles.active}")
    protected String activeProfile;

    public ConfigSkeleton() {
    }

    // Default constructor
    public ConfigSkeleton(Environment environment) {
        this.environment = environment;
    }

    protected String getActiveProfile() {
        return this.activeProfile;
    }

    protected String getConfigString(String rightHandKey, String orElse) {
        return environment.getProperty(activeProfile + rightHandKey, String.class, orElse);
    }

    protected int getConfigInt(String rightHandKey, int orElse) {
        return environment.getProperty(activeProfile + rightHandKey, int.class, orElse);
    }

    protected boolean getConfigBoolean(String rightHandKey, boolean orElse) {
        return environment.getProperty(activeProfile + rightHandKey, boolean.class, orElse);
    }
}
