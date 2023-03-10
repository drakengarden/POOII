package com.patterns.singleton;

public class Singleton { //singleton pattern is a recursive class with a pvt constructor and a method that returns the instance of the class
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}