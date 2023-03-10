package com.patterns.builder;

public interface IBuilder { //segments object creation (abstract methods)
    void setEngine(int nCylinders, int nLitres);
    void setBrand(String brand, String model);
    void setCar(Car car);
}