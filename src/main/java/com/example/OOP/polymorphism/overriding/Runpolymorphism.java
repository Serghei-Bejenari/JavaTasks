package com.example.OOP.polymorphism.overriding;

public class Runpolymorphism {
    public static void main(String[] args) {
        Cat bars = new Cat();
        bars.setFriend("Serghei");
        bars.characteristics();
        bars.voice();
        System.out.println("Barsic`s friend is: " + bars.getFriend());
    }
}