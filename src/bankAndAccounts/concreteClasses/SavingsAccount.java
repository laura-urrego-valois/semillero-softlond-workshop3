package bankAndAccounts.concreteClasses;

import bankAndAccounts.abstractClasses.BasicAccount;

public class SavingsAccount extends BasicAccount {
    private double monthlyInterestRate;

    public SavingsAccount(String accountHolder, String accountNumber, double initialBalance, double monthlyInterestRate) {
        super(accountHolder, accountNumber, initialBalance);
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public double calculateMonthlyInterest() {
        if (monthlyInterestRate <= 0) {
            throw new IllegalArgumentException("Monthly interest rate must be greater than zero.");
        }

        return getBalance() * (monthlyInterestRate / 100);
    }

}
