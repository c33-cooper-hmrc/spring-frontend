package com.spring.springfrontend.controllers;

import com.spring.springfrontend.config.AppConfig;
import com.spring.springfrontend.config.ServicesConfig;
import com.spring.springfrontend.connectors.AuthConnector;
import com.spring.springfrontend.models.forms.LoginForm;
import com.spring.springfrontend.utils.ConfigUtils;
import com.spring.springfrontend.utils.LoggerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AuthController {

    // This classes field dependencies to be used in constructor DI
    private final AppConfig appConfig;
    private final ServicesConfig servicesConfig;
    private final ConfigUtils configUtils;
    private final LoggerUtils loggerUtils;
    private final AuthConnector authConnector;

    @Autowired
    public AuthController(AppConfig appConfig, ServicesConfig servicesConfig, ConfigUtils configUtils, LoggerUtils loggerUtils, AuthConnector authConnector) {
        this.appConfig = appConfig;
        this.servicesConfig = servicesConfig;
        this.configUtils = configUtils;
        this.loggerUtils = loggerUtils;
        this.authConnector = authConnector;
        loggerUtils.setLogger(AuthController.class);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login (Model model, LoginForm loginForm) {
        model.addAttribute("appName", this.appConfig.getAppName());

        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginSubmit(@Valid final LoginForm loginForm, final BindingResult result, RedirectAttributes attr) {
        if(result.hasErrors()) {

            // Log form errors to trace
            loggerUtils.logFormErrors(result, "INFO");

            List<FieldError> errors = result.getFieldErrors();

            for (FieldError error : errors) {

                // add form errors to a flash attribute so that they can be injected
                // back into the login form upon redirect.
                attr.addFlashAttribute(error.getField() + "_error", error.getDefaultMessage());
            }

            return "redirect:/login";
        }

        return "authenticated";
    }
}
