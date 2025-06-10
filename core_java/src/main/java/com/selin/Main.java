package com.selin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*  // JA-1 Sınıf ve Nesne Oluşturma
        Car car = new Car();
        System.out.println("Arabanın marka, model ve yılını giriniz: ");
        car.brand = sc.nextLine();
        car.model = sc.nextLine();
        car.year = sc.nextLine();
        car.yazdir();
         */

        /* // JA-2 Constructor (Yapıcı Metot) Kullanımı
        Car car = new Car("Nissan","Qashqai","2018");

        car.yazdir();
         */

        /* // JA-3 Encapsulation
        Car car = new Car();
        Scanner input = new Scanner(System.in);
        System.out.println("Marka, model ve yıl bilgisini giriniz: ");
        car.setBrand(input.nextLine());
        car.setModel(input.nextLine());
        car.setYear(input.nextLine());
        car.yazdir();
         */

        /*  // JA-4 Inheritance
        System.out.println("Enter the speed: ");
        int speed = sc.nextInt();

        Car car = new Car(speed);

        car.setSpeed(speed);
        car.yazdir();
         */

        /* JA-5 Method Overriding (Metot Ezme)
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        Car car = new Car();
        car.start();
         */

        /* JA-6 Polymorphism (Çok Biçimlilik)
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound();
        System.out.println();
        dog.makeSound();
         */

        /* JA-7 Method Overloading (Metot Aşırı Yükleme)
        int a=3;
        int b=8;
        int c=23;

        Calculator calc = new Calculator();

        System.out.println("a="+a+" b="+b+" c="+c);

        System.out.println("İki parametreli toplam sonucu(a+b): "+calc.add(a,b));
        System.out.println("Üç parametreli toplam sonucu(a+b+c): "+calc.add(a,b,c));
         */

        /* JA-8 Static Kıllanımı
        int a=5;
        int b=6;

        System.out.println("Static metot çarpım sonucu: "+Carp.carp(a,b));
         */

        /* JA-10 Abstract Sınıf Kullanımı
        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
         */

        /* JA-11 Interface Kullanımı
        Cat cat = new Cat();
        cat.sound();

        Dog dog = new Dog();
        dog.sound();
         */








    }
}