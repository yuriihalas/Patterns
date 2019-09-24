package com.epam.behavioural.chainsofresponsibility.model;

public class User {
    private String login;
    private String password;
    private boolean accessToSecurity;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean isAccessToSecurity() {
        return accessToSecurity;
    }

    public void setAccessToSecurity(boolean accessToSecurity) {
        this.accessToSecurity = accessToSecurity;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
            "login='" + login + '\'' +
            ", password='" + password +
            '}';
    }
}
