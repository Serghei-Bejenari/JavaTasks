package com.example.OOP.polymorphism.overloading;

public class Overloading {
    private String name;
    private int age;
    private double weight;
    private String street;
    private int id;

    public Overloading(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Overloading(String name, int age, double weight, String street) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.street = street;
    }

    public Overloading(String name, int age, double weight, String street, int id) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.street = street;
        this.id = id;
    }
}