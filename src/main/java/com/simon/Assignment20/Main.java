package com.simon.Assignment20;

// 20. Gör en klass Vector2 som representerar en punkt eller vektor i 2D med metoder
//för att beräkna längd, avstånd och lägga ihop vektorer.

import static java.lang.IO.*;

public class Main {
    
    void main() {

        Vector2 v1 = new Vector2(1, 5);
        Vector2 v2 = new Vector2(6, 3);

        println( v1.distanceTo( v2 ) );

        Vector2 v3 = v1.add( v2 ).add( new Vector2( 1, 1 ) );

        println( v3.length() );
    }
}
