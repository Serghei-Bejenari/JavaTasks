package com.example.OOP.inheritance;

public class Laptop {

    private String producer;
    private int year;
    private int inch;
    private double weight;

    public Laptop(String producer, int year, int inch, double weight) {
        this.producer = producer;
        this.year = year;
        this.inch = inch;
        this.weight = weight;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                ", inch=" + inch +
                ", weight=" + weight +
                '}';
    }
}