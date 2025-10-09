package com.simon.Assignment43;

import static java.lang.IO.println;

public class Video implements Playable {

    private String title;

    public Video(String title) {
        this.title = title;
    }

    @Override
    public void play() {

        println( "Start video " + this.title );
    }

    @Override
    public void stop() {

        println( "Stop video " + this.title );

    }

    @Override
    public void pause() {

        println( "Pause video " + this.title );
    }

    @Override
    public void resume() {

        println( "Resume video " + this.title );

    }
}
