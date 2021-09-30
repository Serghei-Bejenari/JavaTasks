package com.example.task_6_generics.audio;

public class AudioBooks extends Audio {

    public AudioBooks(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "AudioBooks(id = " + getId() + ")";
    }
}