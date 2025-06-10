package com.selin.Polymorphism;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Kedi ses çıkarıyor");
        System.out.println("Miyav miyav");
    }
}
