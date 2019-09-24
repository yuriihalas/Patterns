package com.epam.behavioural.chainsofresponsibility.model;

public enum DeveloperUser {
    MARK("Mark21312", "12321f"),
    JOHN("John123", "123f");

    private final String login;
    private final String password;

    DeveloperUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
