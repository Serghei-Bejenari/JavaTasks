package com.example.OOP.abstractClass;

public class RunCat {

    public static void main(String[] args) {
        Mammal mammal = new Cat("Barsic", 2, 1.2);
        mammal.sleep();
        mammal.voice();

        Mammal cat = new Cat("Tom", 18);
        cat.sleep();
        cat.voice();
        Cat.eat();
    }
}