package com.simon.Assignment32;

public class Circle extends Shape {

    @Override
    public double area(double x) {
        return Math.PI * Math.pow(x, 2);
    }
}
