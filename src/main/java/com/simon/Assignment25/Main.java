package com.simon.Assignment25;

// 25. Skapa en klass Movie och en metod getAgeLimit() som returnerar 7, 11 eller 15
// beroende på genre

import static java.lang.IO.*;

public class Main {

    void main() {

        Movie movie = new Movie("Saw", "HORROR");

        println( movie.getAgeLimit() );
    }
}
