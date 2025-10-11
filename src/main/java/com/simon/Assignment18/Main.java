package com.simon.Assignment18;

// 18. Gör en klass RgbColor som lagrar färgvärden i RGB-format (0–255) och har
//metoder för att räkna ut ljusstyrka och konvertera till hex-format.

import static java.lang.IO.*;

public class Main {

    void main() {

        RgbColor rgbColor = new RgbColor(255, 100, 201);

        println( rgbColor.getBrightness() );

        println( rgbColor.getHex() );
    }
}
