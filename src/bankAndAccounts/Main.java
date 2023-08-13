package bankAndAccounts;

import bankAndAccounts.concreteClasses.CheckingAccount;
import bankAndAccounts.concreteClasses.SavingsAccount;
import bankAndAccounts.interfaces.IBankAccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the bank!");

        while (true) {
            System.out.println("Choose one of the following options:");
            System.out.println("1. Create savings account");
            System.out.println("2. Create checking account");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the account holder's name: ");
                    String savingsAccountHolder = scanner.nextLine();
                    System.out.println("Enter the account number: ");
                    String savingsAccountNumber = scanner.nextLine();
                    System.out.println("Enter the initial balance: ");
                    double savingsAccountBalance = scanner.nextDouble();
                    System.out.println("Enter the monthly interest rate: ");
                    double savingsAccountMonthlyInterestRate = scanner.nextDouble();
                    SavingsAccount savingsAccount = new SavingsAccount(savingsAccountHolder, savingsAccountNumber, savingsAccountBalance, savingsAccountMonthlyInterestRate);
                    performOperations(savingsAccount, scanner);
                    break;
                case 2:
                    System.out.println("Enter the account holder's name: ");
                    String checkingAccountHolder = scanner.nextLine();
                    System.out.println("Enter the account number: ");
                    String checkingAccountNumber = scanner.nextLine();
                    System.out.println("Enter the initial balance: ");
                    double checkingAccountBalance = scanner.nextDouble();
                    System.out.println("Enter the overdraft limit: ");
                    double checkingAccountOverdraftLimit = scanner.nextDouble();
                    CheckingAccount checkingAccount = new CheckingAccount(checkingAccountHolder, checkingAccountNumber, checkingAccountBalance, checkingAccountOverdraftLimit);
                    performOperations(checkingAccount, scanner);
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;

            }
        }
    }

    public static void performOperations(IBankAccount bankAccount, Scanner scanner) {
        while (true) {
            System.out.println("\nOperations:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Get balance");
            System.out.println("4. Return to main menu");
            System.out.println("Choose an option: ");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.depositMoney(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bankAccount.withdrawMoney(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Balance: " + bankAccount.getBalance());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        }
    }

}

