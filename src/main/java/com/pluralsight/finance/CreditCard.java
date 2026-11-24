package com.pluralsight.finance;

public class CreditCard implements Valuable {
    //attributes for credit card
    private String name;
    private String accountNumber;
    private double balance;   // amount owed

    //constructor for credit card
    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //gettors and settors
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

    //method to calculat the charge
    public void charge(double amount) {
        //check if amount is < 0, return if thats the case
        if (amount <= 0) {
            return;
        }
        balance += amount;   //purchases increase the debt
    }

    //method to pay credit card
    public void pay(double amount) {
        //if amount is < 0, return, it has to be positive
        if (amount <= 0) {
            return;
        }//check if the payment exceeds the amount owed on the credit card, if so print a message
        if (amount > balance) {
            System.out.println("Payment exceeds balance owed");
            return;
        }
        balance -= amount;//payments reduce the debt
    }

    //method to return the balance
    @Override
    public double getValue() {
        return -balance; // debt lowers net worth
    }
}
