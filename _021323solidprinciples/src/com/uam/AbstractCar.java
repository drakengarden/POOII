package com.uam;

public abstract class AbstractCar { //open closed principle; abstract classes have no space in memory
    public abstract Long getPrice(); //abstract methods do not have a body; inherited classes will implement them differently
}