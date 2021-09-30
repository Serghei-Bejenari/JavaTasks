package com.example.OOP.abstractClass;

public abstract class Mammal {
    private String name;
    private String mammalClass;
    private String subClass;
    private int age;
    private double weight;

    public Mammal(String name, String mammalClass, String subClass, int age, double weight) {
        this.name = name;
        this.mammalClass = mammalClass;
        this.subClass = subClass;
        this.age = age;
        this.weight = weight;
        System.out.println("Constructor Mammal");
    }

    public Mammal(String name, String mammalClass) {
        this.name = name;
        this.mammalClass = mammalClass;
    }

    public Mammal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void voice();

    public abstract void sleep();
}