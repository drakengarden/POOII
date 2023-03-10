package com.uam;

public class DatabaseMySQL implements IDatabase{ //liskov principle

    @Override
    public void findAll() {
        System.out.println("All");
    }

    @Override
    public void save() {
        System.out.println("Save");
    }
}