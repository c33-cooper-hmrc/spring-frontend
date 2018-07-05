package com.spring.springfrontend.utils;

import java.util.Optional;

public class NameUtils {

    private Optional<String> optionalName;

    public NameUtils(Optional<String> optionalName) {
        this.optionalName = optionalName;
    }

    public String getName() {
        String name = this.optionalName.map(definedName -> definedName).orElse("name-not-defined");

        return name;
    }
}
