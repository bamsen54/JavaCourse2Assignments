package com.simon.Assignment14;

// 14. Gör en klass TimeSpan som representerar ett tidsintervall i timmar och minuter,
//med metoder för att lägga till och ta bort tid.

import java.sql.Time;

import static java.lang.IO.*;

public class Main {

    void main() {

        TimeSpan timeSpan = new TimeSpan(1, 40);

        timeSpan.addTime(0, 50);

        try {
            timeSpan.subtractTime(1, 15);
        }

        catch (NotEnoughTimeException _) {

        }

        println( timeSpan );
    }
}
