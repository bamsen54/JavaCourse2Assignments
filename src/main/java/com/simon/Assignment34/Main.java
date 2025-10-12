package com.simon.Assignment34;

// 34. Skapa en klasshierarki Employee → Manager → Director med unika metoder

import static java.lang.IO.*;

public class Main {

    void main() {

        Employee e = new Employee( "Simon", 10000 );
        Manager  m = new Manager( "John Doe", 15000, 50 );
        Director d = new Director( "Samantha Smith", 20000, 100, true );

        e.working();
        m.fireEmployee();
        d.talkToAssistant();
    }
}
