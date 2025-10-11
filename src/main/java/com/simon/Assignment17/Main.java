package com.simon.Assignment17;

// 17. Skapa en klass SimpleStringBuffer som kan bygga upp en text med metoder som
// append() och appendLine()

import static java.lang.IO.*;

public class Main {

    void main() {

        SimpleStringBuffer s = new SimpleStringBuffer();

        s.appendLine("Hello ").append("World");

        println(s.toString());
    }
}
