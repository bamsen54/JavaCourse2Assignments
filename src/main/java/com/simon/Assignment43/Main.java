package com.simon.Assignment43;

// 43. Skapa ett interface Playable och implementera det i Game, Song och Video.

import static java.lang.IO.*;

public class Main {

    void main() {

        Game game   = new Game("Fortnite");
        Song song   = new Song("Billie Jean");
        Video video = new Video("Baby Shark");

        game.play();
        game.save();
        game.pause();
        game.resume();
        game.stop();

        println("");

        song.play();
        song.record();
        song.pause();
        song.resume();
        song.stop();

        println("");

        video.play();
        video.pause();
        video.resume();
        video.stop();
    }
}
