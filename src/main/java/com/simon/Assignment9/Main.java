package com.simon.Assignment9;

// 9.Skriv en klass Counter som håller räkning på antalet skapade objekt (via en statisk variabel).

import static java.lang.IO.*;

public class Main {

    void main() {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        println( Counter.getCounter() );
    }
}
