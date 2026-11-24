package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApp {
    public static void main(String[] args) {

        //initialize objects
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456",1500);
        Valuable account3 = new BankAccount("Gary", "456",1500);

        account1.deposit(100);
        //account2.deposit(100);
        account3.getValue();

        System.out.println(account3.getValue());

    }
}
