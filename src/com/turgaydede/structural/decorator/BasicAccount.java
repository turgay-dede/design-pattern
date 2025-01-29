package com.turgaydede.structural.decorator;

public class BasicAccount implements BankAccount {
    private double balance;

    public BasicAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " TL hesaba yatırıldı. Güncel bakiye: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " TL hesaptan çekildi. Güncel bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye. İşlem gerçekleştirilemedi.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
