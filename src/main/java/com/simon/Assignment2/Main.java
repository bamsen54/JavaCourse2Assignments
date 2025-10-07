package com.simon.Assignment2;

// Skapa en klass Rectangle med bredd och höjd. Lägg till en metod som beräknar arean

import static java.lang.IO.*;

public class Main {

    void main() {

        Rectangle rectangle = new Rectangle(42.420, 13.37);

        double area = rectangle.calculateArea();
        println(area);
    }
}
