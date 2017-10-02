package com.example.doanlv4.databindingdemo.main;

/**
 * Created by doanLV4 on 10/2/2017.
 */

public class User {
    private final String firstName;
    private final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public boolean isShow() {
        return false;
    }
}