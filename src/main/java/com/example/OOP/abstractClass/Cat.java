package com.example.OOP.abstractClass;

public class Cat extends Mammal {

    public Cat(String name, int age, double weight) {
        super(name, "Cat", "Domestic", age, weight);
        System.out.println("Constructor Cat");
    }

    public Cat(String name, int age) {
        super(name, age, 3.300);
        System.out.println("Constructor Cat");
    }

    public void voice() {
        System.out.println("I`m Cat");
    }

    public void sleep() {
        System.out.println("Zzzz");
    }

    public static void eat() {
        System.out.println("hrum, hrum");
    }
}