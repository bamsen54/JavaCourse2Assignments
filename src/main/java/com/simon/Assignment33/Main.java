package com.simon.Assignment33;

// 33. Gör en klass Vehicle och låt Car och Bicycle ärva. Lägg till attribut som är
// specifika för varje fordon

import static java.lang.IO.*;

public class Main {

    void main() {

        Car c = new Car( false, 0, 55 );
        Bicycle b = new Bicycle(true, 5, false );

        println( c.getLitersOfFuel() );
        println( b.isHasLamps() );
    }
}
