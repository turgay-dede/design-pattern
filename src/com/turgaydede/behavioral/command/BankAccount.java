package com.turgaydede.behavioral.command;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountNumber + ": hesap numaralı hesaba " + amount + " TL yatırıldı. Yeni bakiye: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountNumber + ": hesap numaralı hesaptan " + amount + " TL çekildi. Yeni bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye. İşlem gerçekleştirilemedi.");
        }
    }
}
