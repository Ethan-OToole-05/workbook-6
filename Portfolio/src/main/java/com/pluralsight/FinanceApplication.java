package com.pluralsight;

import com.pluralsight.finance.BankAccount;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);

        //Testing out BankAccount deposit method and getValue method functionality.
        System.out.println(account1.getValue());

        account1.deposit(100);

        System.out.println(account1.getValue());

        //Valuable does not have access to the deposit method in BankAccount class.
//        account2.deposit(100);

    }
}
