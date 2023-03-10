package com.patterns.builder;

public class Main {
    public static void main(String[] args) { //instantiate luxury car
        IBuilder carLux = new CarBuilder(); //can access interface methods
        Car car = new Car(); //for enum finite values
        car.setCarType(CarType.LUJO);
        carLux.setCar(car); //car is an attribute of CarBuilder, and its value will be pulled from the CarType enum
        carLux.setBrand("BMW", "X5");
        carLux.setEngine(5, 5);
    }
}