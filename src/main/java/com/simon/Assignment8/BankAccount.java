package com.simon.Assignment8;

import static java.lang.IO.*;

public class BankAccount {

    private int id;
    private String name;
    private String password;

    private double balance;

    public BankAccount() {

    }

    public BankAccount(int id, String name, String password) {
        this.id       = id;
        this.name     = name;
        this.password = password;
    }

    public double getBalance() {

        return this.balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {

        return this.id;
    }

    public void deposit(double amount) {

        if( amount > 0 )
            this.balance += amount;
    }

    public void withdraw(double amount) {

        if( amount > this.balance )
            throw new InsufficientFundsException("Insufficient Funds");

        if( amount > 0 )
            this.balance -= amount;
    }
}
