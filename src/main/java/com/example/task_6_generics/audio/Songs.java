package com.example.task_6_generics.audio;

public class Songs extends Audio {

    public Songs(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Songs(id = " + getId() + ")";
    }
}