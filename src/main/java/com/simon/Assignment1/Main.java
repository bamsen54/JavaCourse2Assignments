package com.simon.Assignment1;

import static java.lang.IO.*;

public class Main {

    void main() {

        Person person =  new Person("Jane Doe", 30);

        println( person.getName() + " " + person.getAge() );
    }
}
