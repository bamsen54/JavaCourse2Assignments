package com.simon.Assignment8;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.IO.*;

public class BankSystem {

    private static int numberOfAccounts = 0;

    private static final ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public static void init() {

        bankAccounts.add( new BankAccount(0, "simon", "1234" ) );
        bankAccounts.add( new BankAccount(1, "frida", "password" ) );

        numberOfAccounts =  bankAccounts.size();

        bankAccounts.get(0).deposit(1000);
        bankAccounts.get(1).deposit(1000);
    }

    public static void handleInstruction(String instruction) {

        instruction = instruction.toLowerCase();

        if( instruction.equals( "open account" ) )
            openAccount();

        else if( instruction.equals( "login" ) )
            login();
    }

    private static void openAccount() {

        println("\nOpening account");
        print("Enter name: ");
        String name = IO.readln();
        print("Enter password: ");
        String password = IO.readln();

        bankAccounts.add( new BankAccount( numberOfAccounts, name, password ) );
        numberOfAccounts++;

        println("Tank you for opening account\n");

    }

    private static void login() {

        BankAccount bankAccount = null;

        while( bankAccount == null ) {
            println("login");
            print("Enter name: ");
            String name = IO.readln();
            print("Enter password: ");
            String password = IO.readln();

            bankAccount = getAccount( name, password );

            if( bankAccount == null ) {

                println( "wrong name or password, do you want to try again?" );

                String instruction = IO.readln();
                instruction = instruction.toLowerCase();
                instruction = instruction.replaceAll("\\s+", " ");

                if( instruction.equals( "no" ) )
                    return;
            }
        }

        println( bankAccount.getName() + " logged in");

        while( true ) {

            print( bankAccount.getName() +  " > ");
            String instruction = IO.readln();

            if( instruction.equals( "logout" ) )
                return;



            handleAccountInstruction( instruction, bankAccount.getId() );
        }
    }

    private static void handleAccountInstruction(String instruction, int id) {

        instruction = instruction.toLowerCase();
        instruction = instruction.replaceAll("\\s+", " ");
        instruction = instruction.trim();

        String[] inst = instruction.split(" ");
        BankAccount thisAccount =  bankAccounts.get( id );

        if( inst.length == 1 ) {

        }

        else if( inst.length == 2 ) {

            if( inst[0].equals( "show" ) &&  inst[1].equals( "balance" ) )
                println( thisAccount.getBalance() );

            else if( inst[0].equals( "show" ) &&  inst[1].equals( "info" ) ) {

                println( "id: " + thisAccount.getId() );
                println( "name: " + thisAccount.getName() );
                println( "balance: " + thisAccount.getBalance() );
            }

            else if( inst[0].equals( "deposit" ) ) {

                try {
                    double amount = Double.parseDouble( inst[1] );

                    if( amount < 0 )
                        println( "can not deposit negative amount" );

                    else {

                        thisAccount.deposit(amount);
                        println( amount + " deposited" );
                    }
                }

                catch ( Exception e ) {

                    println( "invalid deposit amount" );
                }
            }

            else if( inst[0].equals( "withdraw" ) )  {

                try {
                    double amount = Double.parseDouble( inst[1] );

                    if( amount < 0 )
                        println( "can not withdraw negative amount" );

                    else {

                        thisAccount.withdraw(amount);
                        println( amount + " withdrawn" );

                    }
                }

                catch ( Exception e ) {

                    println( "invalid deposit amount" );
                }
            }
        }

        else if( inst.length == 4 ) {

            if (inst[0].equals("send") && inst[2].equals("to") ) {

                try  {

                    final double amount = Double.parseDouble( inst[1] );
                    final int to        = Integer.parseInt( inst[3] );

                    BankAccount toAccount =  getAccount( to );

                    if( toAccount != null ) {

                        if( amount > thisAccount.getBalance() )
                            println( "insufficient funds" );

                        else {

                            thisAccount.withdraw(amount);
                            toAccount.deposit(amount);

                            println(amount + " sent to " + toAccount.getId() );
                        }
                    }

                    else {

                        println( "no account with that id" );
                    }
                }

                catch ( Exception e ) {

                    println( "invalid instruction" );
                    return;
                }
            }
        }
    }

    private static BankAccount getAccount(String name, String password ) {

        for( BankAccount account : bankAccounts ) {

            if( account.getName().equals( name ) && account.getPassword().equals( password ) )
                return account;
        }

        return null;
    }

    private static BankAccount getAccount(int id) {

        for( BankAccount account : bankAccounts ) {

            if( account.getId() == id )
                return account;
        }

        return null;
    }
}
