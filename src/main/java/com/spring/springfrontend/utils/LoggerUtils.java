package com.spring.springfrontend.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

@Component
public class LoggerUtils {

    private Logger logger;

    public LoggerUtils() {
    }

    public void setLogger(Class<?> clazz) {
        this.logger = LoggerFactory.getLogger(clazz);
    }

    public Logger getLogger() {
        return this.logger;
    }

    public void logFormErrors(BindingResult result, String logLevel) {
        List<FieldError> errors = result.getFieldErrors();

        for (FieldError error : errors) {

            switch (logLevel) {
                case ("DEBUG"): logger.debug( error.getObjectName() + " - " + error.getDefaultMessage() ); break;
                case ("INFO"): logger.info( error.getObjectName() + " - " + error.getDefaultMessage() ); break;
                default: logger.debug( error.getObjectName() + " - " + error.getDefaultMessage() ); break;
            }
        }
    }
}
