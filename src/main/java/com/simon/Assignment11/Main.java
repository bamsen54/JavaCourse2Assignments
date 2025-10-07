package com.simon.Assignment11;

// 11.Skapa en klass Stopwatch med metoder för att starta, stoppa och beräkna hur lång tid som gått mellan start och stopp.

import static java.lang.IO.*;

public class Main {

    void main() {

        StopWatch sw = new StopWatch();

        sw.start();

        for( int k = 0; k < 10000000; k++ )
            println(k);

        sw.stop();
    }
}
