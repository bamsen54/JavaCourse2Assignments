package com.simon.Assignment8;

public class BankAccount {

    private double balance;

    public BankAccount() {

    }

    public double getBalance() {

        return this.balance;
    }

    public void deposit(double amount) {

        if( amount > 0 )
            this.balance += amount;
    }

    public void withdraw(double amount) {

        if( amount > 0 )
            this.balance -= amount;
    }
}
