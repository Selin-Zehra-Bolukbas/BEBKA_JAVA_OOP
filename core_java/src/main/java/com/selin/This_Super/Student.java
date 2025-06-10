package com.selin.This_Super;

public class Student extends Person {

    public int id;

    public Student(String name,int age,int id){
        super(name,age);
        this.id = id;
    }

}