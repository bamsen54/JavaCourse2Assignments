package com.simon.Assignment1;

// 1. Skapa en klass Person med namn och ålder. Skapa ett objekt och skriv ut dess värden

import static java.lang.IO.*;

public class Main {

    void main() {

        Person person =  new Person("Jane Doe", 30);

        println( person.getName() + " " + person.getAge() );
    }
}
