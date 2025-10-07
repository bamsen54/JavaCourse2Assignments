package com.simon.Assignment9;

public class Counter {

    private static int counter = 0;

    public Counter() {

        counter++;
    }

    public static int getCounter() {

        return counter;
    }
}
