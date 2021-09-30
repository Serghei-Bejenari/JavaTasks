package com.example.OOP.polymorphism.overriding;

public class Cat extends Feline {

    private String friend;

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    @Override
    public void characteristics() {
        System.out.println("This is Cat characteristics");
    }

    @Override
    public void voice() {
        System.out.println("Mey Mey Mey");
    }

}