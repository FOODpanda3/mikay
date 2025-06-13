/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.account.money.transfer;

/**
 *
 * @author VILLACORTA_CpE121
 */
public class Bank {
    
    public void transferMoney(BankAccount from, BankAccount to, double amount) {
        if (amount > 0 && from.getBanlace() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Transferred:" + amount + "\nfrom:" +from+ "\nto:" +to );
        } else {
            System.out.println("Invalid Amount");
        }
    } 
}