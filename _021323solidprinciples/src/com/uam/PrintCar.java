package com.uam;

public class PrintCar {
    public static void main(String [] args) { //open closed principle
        AbstractCar[] arrayCar = { //array of Car objects
                new Toyota(), //calling constructor
                new Mercedes()
        };

        for (AbstractCar c : arrayCar) { //for every element in the array
            c.getPrice();
        }
    }
}