package com.simon.Assignment8;

import static java.lang.IO.*;

public class BankAccount {

    private double balance;

    public BankAccount() {

    }

    public double getBalance() {

        return this.balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void deposit(double amount) {

        if( amount > 0 )
            this.balance += amount;
    }

    public void withdraw(double amount) {

        if( amount > 0 )
            this.balance -= amount;

        if( amount > this.balance )
            println( " not enough money " );

    }
}
