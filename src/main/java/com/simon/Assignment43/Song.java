package com.simon.Assignment43;

import static java.lang.IO.print;
import static java.lang.IO.println;

public class Song implements Playable {

    private String title;

    public Song(String title) {

        this.title = title;
    }

    @Override
    public void play() {

        println( "Start song " + this.title );
    }

    @Override
    public void stop() {

        println( "Stop song " + this.title );

    }

    @Override
    public void pause() {

        println( "Pause song " + this.title );
    }

    @Override
    public void resume() {

        println( "Resume song " + this.title );
    }

    public void record() {

        print( "Recording song " + this.title );
    }
}
