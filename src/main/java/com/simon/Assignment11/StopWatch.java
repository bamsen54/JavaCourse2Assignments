package com.simon.Assignment11;

import static java.lang.IO.*;


public class StopWatch {

    private long start;
    private long stop;

    public StopWatch() {

    }

    public void start() {

        this.start = System.currentTimeMillis();
    }

    public void stop() {

        this.stop = System.currentTimeMillis();

        println( "Time:" +  ( this.stop - this.start ) / 1000 + " sec"  );
    }
}
