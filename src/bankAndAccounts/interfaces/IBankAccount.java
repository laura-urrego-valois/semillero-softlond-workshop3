package bankAndAccounts.interfaces;

public interface IBankAccount {

    void depositMoney(double amount);
    boolean withdrawMoney(double amount);
    double getBalance();

}
