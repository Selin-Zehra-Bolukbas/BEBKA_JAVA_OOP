package com.selin.Constructor_Kullanimi;

public class Car {
    public String brand;
    public String model;
    public String year;

    public Car(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void yazdir() {
        System.out.println("" + brand + " " + model + " " + year);
    }

}
