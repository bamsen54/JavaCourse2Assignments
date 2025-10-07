package com.simon.Assignment3;

public class Car {

    private String model;
    private String year;
    private String color;

    public Car() {

    }

    public Car(String model, String year, String color) {

        this.model = model;
        this.year  = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {

        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
}
