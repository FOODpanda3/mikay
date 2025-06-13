/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank.account.money.transfer;

/**
 *
 * @author VILLACORTA_CpE121
 */
public class BankAccountMoneyTransfer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67891", 1000.0);

        System.out.println("Before Transfer:");
        System.out.println("Account 1:");
        account1.displayAccountInfo();
        System.out.println("Account 2:");
        account2.displayAccountInfo();

        Bank bank = new Bank();
        bank.transferMoney(account1, account2, 200.0);

        System.out.println("\nAfter Transfer:");
        System.out.println("Account 1:");
        account1.displayAccountInfo();
        System.out.println("Account 2:");
        account2.displayAccountInfo();
    }

}
