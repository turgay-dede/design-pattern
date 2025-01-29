package com.turgaydede.creational.factory;

public class BankApplication {
    public static void main(String[] args) {
        BankAccount savingsAccount = BankAccountFactory.createAccount(AccountType.SAVINGS);
        savingsAccount.deposit(5000);
        savingsAccount.withdraw(1000);
        System.out.println("Bireysel hesap bakiyesi: " + savingsAccount.getBalance() + " TL");

        System.out.println("-------------------------------");

        BankAccount businessAccount = BankAccountFactory.createAccount(AccountType.BUSINESS);
        businessAccount.deposit(20000);
        businessAccount.withdraw(5000);
        System.out.println("Kurumsal hesap bakiyesi: " + businessAccount.getBalance() + " TL");
    }
}
