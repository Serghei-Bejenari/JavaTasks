package com.example.OOP.encapsulation;

public class RunEncapsulation {

    public static void main(String[] args) {
        Encapsulation test = new Encapsulation();
        test.setName("Serhei");
        test.setAge(23);
        test.setWeight(74.45);

        System.out.println("Name: " + test.getName());
        System.out.println("Age: " + test.getAge());
        System.out.println("Weight: " + test.getWeight());
    }
}