package com.patterns.builder;

public class CarBuilder implements IBuilder { //segments object creation (interface methods implemented)
    private int nCylinders;
    private int nLitres;
    private String brand;
    private String model;
    private Car car;

    @Override
    public void setEngine(int nCylinders, int nLitres) { //sets args as values for class instance attributes
        this.nCylinders = nCylinders;
        this.nLitres = nLitres;
    }

    @Override
    public void setBrand(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void setCar(Car car) {

    }
}