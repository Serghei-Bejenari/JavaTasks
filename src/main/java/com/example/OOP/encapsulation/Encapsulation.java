package com.example.OOP.encapsulation;

public class Encapsulation {
    private String name;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String newName) {
        name = newName;

    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;

    }
}