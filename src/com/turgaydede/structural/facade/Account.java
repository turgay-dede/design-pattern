package com.turgaydede.structural.facade;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        balance += amount;
        System.out.println(amount + " TL hesaba yatırıldı. Güncel bakiye: " + balance);
        return true;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " TL hesaptan çekildi. Güncel bakiye: " + balance);
            return true;
        } else {
            System.out.println("Yetersiz bakiye. İşlem gerçekleştirilemedi.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}
