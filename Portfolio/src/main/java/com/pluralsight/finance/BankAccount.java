package com.pluralsight.finance;

import com.pluralsight.Valuable;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(this.balance < 0) {
            //error message
        }
        else {
            this.balance -= amount;
        }
    }

    @Override
    public double getValue() {
        return 0;
    }
}
