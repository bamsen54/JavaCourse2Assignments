package com.simon.Assignment1;

// 1. Skapa en klass Person med namn och ålder. Skapa ett objekt och skriv ut dess värden

import static java.lang.IO.*;

public class Main {

    void main() {


        Person person1 = new Person( "Jane Doe", 21, new Address("Main St.", 1, 12, "NY") );
        Person person2 = new Person( "John Doe", 30, new Address( "Second st.", 5, 32, "LA" ) );

        if( person1.isOlderThan(person2) )
            println( "person1 is older" );

        else if( person1.getAge() == person2.getAge() )
            println( "they are the same age" );

        else
            println( "person2 is older" );

        println("\n");

        println(person1);
        println(person2);
    }
}
