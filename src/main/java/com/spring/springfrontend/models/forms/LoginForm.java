package com.spring.springfrontend.models.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {

    @NotNull(message = "Username can not be empty")
    @Size(min = 1, max = 30, message = "Username size must be between 1-30 characters")
    private String username;

    @NotNull(message = "Password can not be empty")
    @Size(min = 1, max = 10, message = "Password size must be between 1-10 characters")
    private String password;

    public LoginForm() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        return "LoginForm{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
