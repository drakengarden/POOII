package com.patterns.singleton;

public class UtilString { //example of singleton pattern
    private static UtilString instance = new UtilString(); //both object and method have to be static

    private UtilString() {} //private constructor

    public static UtilString getInstance() { //returns current instance
        return instance;
    }

    public boolean isEmpty(String str) { //default value of primitive type boolean is false (zero)
        if ((str == null) || (str.length() == 0)) {
            return true;
        }
        return false;
    }
}