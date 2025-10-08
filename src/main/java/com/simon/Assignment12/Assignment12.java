package com.simon.Assignment12;

// 12. Gör en klass Angle som lagrar en vinkel i grader och har metoder för att lägga till,
//ta bort och omvandla till radianer

import static java.lang.IO.*;

public class Assignment12 {

    public void main() {

        Angle angle = new Angle(45);
        angle.addToAngleInDegrees(45);

        println( angle.getAngleInRadians() );
    }
}
