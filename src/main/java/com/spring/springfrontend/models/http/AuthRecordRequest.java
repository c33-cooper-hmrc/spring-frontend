package com.spring.springfrontend.models.http;

public class AuthRecordRequest {

    private String username;

    public AuthRecordRequest(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
