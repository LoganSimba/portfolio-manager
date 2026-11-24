package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApp {
    public static void main(String[] args) {

        //initialize objects
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);
        Valuable account3 = new BankAccount("Ronaldo", "456", 1200);

        account1.deposit(100);
        //account2.deposit(100);
        account3.getValue();

        System.out.println(account3.getValue());
        //create porfolio and add assets to the list
        Portfolio portfolio = new Portfolio("logan", "Simba");
        portfolio.add(account1);
        portfolio.add(account2);
        portfolio.add(account3);
        //print message to show the most valuable and least valuable
        System.out.println("=============");
        System.out.println("Most valuable " + portfolio.getMostValuable().getValue());
        System.out.println("least valuable " + portfolio.getLeastValuable().getValue());


    }
}
