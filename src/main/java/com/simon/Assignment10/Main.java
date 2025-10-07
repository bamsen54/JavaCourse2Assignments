package com.simon.Assignment10;

// 10.Gör en klass Student med en metod printGrade() som avgör betyg utifrån en poängsumma.

import static java.lang.IO.*;

public class Main {

    void main( ) {

        Student student = new Student();
        student.setScore(75);

        println(student.getGradeBasedOnCurrentScore());
    }
}
