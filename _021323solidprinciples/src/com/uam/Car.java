package com.uam;

public class Car { //open closed principle: classes do not allow modification, but they do allow expansion
    private Long id;
    private String plate;
    private String brand;
    public Car(String brand) { //constructor
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}