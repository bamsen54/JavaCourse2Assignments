package com.simon.Assignment8;

// 8.Skapa en klass BankAccount med metoder för deposit(), withdraw() och getBalance()

import static java.lang.IO.*;

public class Main {

    void main() {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(1000);
        bankAccount.withdraw(250);

        println( bankAccount.getBalance() );
    }
}
