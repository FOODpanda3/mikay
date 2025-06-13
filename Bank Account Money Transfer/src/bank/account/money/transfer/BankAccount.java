/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.account.money.transfer;

/**
 *
 * @author VILLACORTA_CpE121
 */
public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Balance:" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit:" + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn:" + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public double getBanlace() {
        return balance;
    }

    public void setBalace(double balance) {
        this.balance = balance;
    }
}
