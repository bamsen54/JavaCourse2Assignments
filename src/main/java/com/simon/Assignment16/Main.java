package com.simon.Assignment16;

// 16. Gör en klass Thermometer som kan ta emot temperaturmätningar och räkna ut
// medelvärdet av alla mätningar.

import static java.lang.IO.*;

public class Main {

    void main() {

        Thermometer thermometer = new Thermometer();

        thermometer.addTemperatures(24);
        thermometer.addTemperatures(-5);
        thermometer.addTemperatures(-32);

        println( thermometer.getAverageTemperature() );
    }
}
