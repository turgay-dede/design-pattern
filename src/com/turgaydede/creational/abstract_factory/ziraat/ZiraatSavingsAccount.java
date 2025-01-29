package com.turgaydede.creational.abstract_factory.ziraat;

import com.turgaydede.creational.abstract_factory.BankAccount;

public class ZiraatSavingsAccount implements BankAccount {
    private double balance;

    public ZiraatSavingsAccount() {
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Ziraat Bireysel Hesabına " + amount + " TL yatırıldı. Güncel bakiye: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Ziraat Bireysel Hesabından " + amount + " TL çekildi. Güncel bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
