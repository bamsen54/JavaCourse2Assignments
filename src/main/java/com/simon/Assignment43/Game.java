package com.simon.Assignment43;

import static java.lang.IO.*;


public class Game implements Playable {

    private String title;

    public Game(String title) {

        this.title = title;
    }

    @Override
    public void play() {

        println( "Start game " + this.title );
    }

    @Override
    public void stop() {

        println( "Stop game " + this.title );

    }

    @Override
    public void pause() {

        println( "Pause game " + this.title );
    }

    @Override
    public void resume() {

        println( "Resume game " + this.title );

    }

    public void save() {
        println( "Game saved");
    }
}
