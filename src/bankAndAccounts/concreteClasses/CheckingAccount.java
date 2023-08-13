package bankAndAccounts.concreteClasses;

import bankAndAccounts.abstractClasses.BasicAccount;

public class CheckingAccount extends BasicAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountHolder, String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountHolder, accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdrawMoney(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            double newBalance = getBalance() - amount;
            if (newBalance < 0) {
                System.out.println("Overdraft withdrawal. The new balance is " + newBalance);
            } else {
                System.out.println("Successful withdrawal! Your new balance is " + newBalance);
            }
            return true;
        } else {
            System.out.println("Invalid amount! Insufficient funds.");
            return false;
        }

    }

}

