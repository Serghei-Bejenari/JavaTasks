package com.example.task_6_generics.video;

public class Movies extends Video {

    public Movies(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Movies(id = " + getId() + ")";
    }
}