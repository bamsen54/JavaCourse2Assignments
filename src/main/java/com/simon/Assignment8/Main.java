package com.simon.Assignment8;
// 8.Skapa en klass BankAccount med metoder för deposit(), withdraw() och getBalance()
//

import com.simon.Assignment8.BankSystem;

import static java.lang.IO.*;


public class Main {

    void mainMenu() {

        while( true ) {

            print("main menu > ");
            String instruction = IO.readln();
            instruction = instruction.toLowerCase();
            instruction = instruction.replaceAll("\\s+", " " );
            BankSystem.handleInstruction(instruction);

            if( instruction.equals( "exit" ) )
                return;
        }
    }

    void main() {

        BankSystem.init();
        mainMenu();
    }
}
