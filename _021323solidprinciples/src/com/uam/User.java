package com.uam;

public class User { //single responsibility principle; refactor to rename a class
    private String id; //right click > generate > getter and setter to access pvt var, methods
    private String name;
    private String lastName;

    public String getId() { //class with its getters and setters is a BEAN
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}