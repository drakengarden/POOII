package com.uam;

public class Mercedes extends AbstractCar { //open closed principle; if we want to add another brand, we simply add another class
    @Override
    public Long getPrice() {
        return 70000L;
    }
}