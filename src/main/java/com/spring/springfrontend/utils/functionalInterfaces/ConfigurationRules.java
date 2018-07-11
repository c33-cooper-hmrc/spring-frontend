package com.spring.springfrontend.utils.functionalInterfaces;

@FunctionalInterface
public interface ConfigurationRules <T> {
    boolean apply(T value);
}
