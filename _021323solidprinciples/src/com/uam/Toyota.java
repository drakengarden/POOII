package com.uam;

public class Toyota extends AbstractCar { //open closed principle; inherits from AbstractCar to implement method
    @Override
    public Long getPrice() {
        return 50000L;
    }
}