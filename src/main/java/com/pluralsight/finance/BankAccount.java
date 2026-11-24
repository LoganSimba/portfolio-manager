package com.pluralsight.finance;

public class BankAccount implements Valuable {
    //attrubutes for the bankAccount
    private String name;
    private String accountNumber;
    private double balance;

    //constructor for the BankAccount
    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //gettors and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //method for deposit
    public void deposit(double amount) {
        //check if the amount is greater than o, if not return
        if (amount <= 0) {
            return;
        }
        //add the deposit to the balance
        this.balance += amount;
    }

    //method to withdraw
    public void withdraw(double amount) {
        //check if amount is positive because you cannot withdraw a negative number
        if (amount <= 0) {
            return;
        }//check if amount to withdraw > balance, if so print a message to let the user know
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }//reduce the balance from the amount withdrawn
        balance -= amount;
    }

    //method to get the value that returns the current balance
    @Override
    public double getValue() {
        return balance;

    }
}
