package com.spring.springfrontend.models.http;

import com.spring.springfrontend.models.auth.User;

public class AuthRecordResponse {

    private User user;

    public AuthRecordResponse() {
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
