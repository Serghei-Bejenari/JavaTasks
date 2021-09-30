package com.example.task_6_generics.printed;

public class Books extends Printed {
    public Books(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Books(id = " + getId() + ")";
    }
}