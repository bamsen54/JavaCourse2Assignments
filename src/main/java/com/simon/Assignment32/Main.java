package com.simon.Assignment32;

// 32. Skapa en klass Shape med metoden area(). Låt Circle och Rectangle ärva och
//implementera

import static java.lang.IO.*;

public class Main {

    void main() {

        Shape c = new Circle();
        Shape r = new Rectangle();

        println( c.area(5) );
        println( r.area(5, 4) );
    }
}
