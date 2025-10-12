package com.simon.Assignment25;

public class Movie {

    private String name;
    private String genre;

    public Movie() {
    }

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAgeLimit() {

        return switch ( this.genre ) {

            case "FAMILY" -> 7;
            case "ACTION" -> 11;
            case "HORROR" -> 15;

            default -> 0;
        };
    }
}
