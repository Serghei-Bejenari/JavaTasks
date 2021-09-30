package com.example.task_6_generics.video;

public class TvShows extends Video {

    public TvShows(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "TvShows(id = " + getId() + ")";
    }
}