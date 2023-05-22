package com.patterns.builder;

public class Car {
    private CarType carType;

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) { //pulls from enum
        this.carType = carType;
    }
}