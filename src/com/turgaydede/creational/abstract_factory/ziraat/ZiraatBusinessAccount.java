package com.turgaydede.creational.abstract_factory.ziraat;

import com.turgaydede.creational.abstract_factory.BankAccount;

public class ZiraatBusinessAccount implements BankAccount {
    private double balance;

    public ZiraatBusinessAccount() {
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Ziraat Kurumsal Hesabına " + amount + " TL yatırıldı. Güncel bakiye: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Ziraat Kurumsal Hesabından " + amount + " TL çekildi. Güncel bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
