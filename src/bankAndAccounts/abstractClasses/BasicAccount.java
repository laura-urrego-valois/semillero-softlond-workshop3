package bankAndAccounts.abstractClasses;

import bankAndAccounts.interfaces.IBankAccount;

public abstract class BasicAccount implements IBankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BasicAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successful deposit! Your new balance is " + balance);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public boolean withdrawMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Withdrawal amount must be greater than zero.");
            return false;
        }

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Successful withdrawal! Your new balance is " + balance);
            return true;
        } else {
            System.out.println("Invalid amount! Insufficient funds.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
