package com.example.OOP.inheritance;

public class Dell extends Laptop {
    private String model;

    public Dell(String model, int year, int inch, double weight) {
        super("Dell", year, inch, weight);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Dell{" +
                "model='" + model + '\'' +
                '}' + super.toString();
    }
}