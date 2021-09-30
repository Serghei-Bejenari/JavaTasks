package com.example.task_6_generics.printed;

public class Magazines extends Printed {
    public Magazines(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Magazines(id = " + getId() + ")";
    }
}