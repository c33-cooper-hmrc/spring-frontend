package com.spring.springfrontend.controllers;

import com.spring.springfrontend.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

    // This classes field dependencies to be used in constructor DI
    private final AppConfig appConfig;

    @Autowired
    public AuthController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    String login (Model model) {
        model.addAttribute("appName", this.appConfig.getAppName());

        return "login";
    }
}
