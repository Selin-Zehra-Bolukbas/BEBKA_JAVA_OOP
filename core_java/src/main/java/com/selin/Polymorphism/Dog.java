package com.selin.Polymorphism;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Köpek ses çkarıyor");
        System.out.println("Hav hav");
    }
}
