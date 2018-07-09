package com.spring.springfrontend.config.beans;

import com.spring.springfrontend.utils.LoggerUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonBeans {

    @Bean
    public LoggerUtils loggerUtils() {
        LoggerUtils loggerUtils = new LoggerUtils();

        return loggerUtils;
    }
}
