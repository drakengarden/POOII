package com.uam;

public class UserDB { //single responsibility principle: classes have a single resp
    public void insertUser() {
        System.out.println("Inserting user: ");
    }

    public User findById(Long id) {
        return new User();
    }
}