package com.selin.Inheritance;

public class Vehicle {
    private int speed;

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void yazdir(){
        System.out.println(speed);
    }
}
