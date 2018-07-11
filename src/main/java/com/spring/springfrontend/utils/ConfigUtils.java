package com.spring.springfrontend.utils;

import com.spring.springfrontend.utils.functionalInterfaces.ConfigurationRules;
import org.springframework.stereotype.Component;

@Component
public class ConfigUtils {

    // Functional interfaces
    private static ConfigurationRules <String> isServiceHttpProtocolDefined;
    private static ConfigurationRules <String> isServiceHttpHostDefined;
    private static ConfigurationRules <String> isServiceHttpPortDefined;

    // Class constructor
    public ConfigUtils() {
        this.isServiceHttpProtocolDefined = (String value) -> ( !value.isEmpty() && !value.equals("unknown_http_protocol") );
        this.isServiceHttpHostDefined = (String value) -> ( !value.isEmpty() && !value.equals("unknown_host") );
        this.isServiceHttpPortDefined = (String value) -> ( !value.isEmpty() && !value.equals("unknown_port") );
    }

    // Configuration rules checker abstraction
    private <T> boolean configurationRulesChecker(ConfigurationRules configurationRules, T value) {
        return configurationRules.apply(value);
    }

    public boolean isServiceHttpHostDefined(String value) {
        return configurationRulesChecker(this.isServiceHttpHostDefined, value);
    }

    public boolean isServiceHttpPortDefined(String value) {
        return configurationRulesChecker(this.isServiceHttpPortDefined, value);
    }

    public boolean isServiceHttpProtocolDefined(String value) {
        return configurationRulesChecker(this.isServiceHttpProtocolDefined, value);
    }
}
