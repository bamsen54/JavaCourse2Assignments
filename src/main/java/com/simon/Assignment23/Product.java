package com.simon.Assignment23;

import static java.lang.IO.*;

public class Product {

    private String name;
    private double price;

    public Product() {

    }

    public Product(String name) {

        this.name  = name;
        this.price = 0;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discount) {

        if( discount < 0 || discount > 100)
            throw new IllegalArgumentException("Percent are between 0 and 100");

        double percentFactor = ( 100 - discount ) / 100;

        this.price *= percentFactor;
    }
}
