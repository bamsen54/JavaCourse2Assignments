package com.simon.Assignment7;


import static java.lang.IO.*;
import java.math.*;

public class Circle {

    public Circle() {

    }

    public static double area(double radius) {

        return Math.PI * radius * radius;
    }

    public static double circumference(double radius) {

        return 2 * Math.PI * radius;
    }
}
