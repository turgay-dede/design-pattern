package com.turgaydede.creational.abstract_factory.garanti;

import com.turgaydede.creational.abstract_factory.BankAccount;

public class GarantiBusinessAccount implements BankAccount {
    private double balance;

    public GarantiBusinessAccount() {
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Garanti Kurumsal Hesabına " + amount + " TL yatırıldı. Güncel bakiye: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Garanti Kurumsal Hesabından " + amount + " TL çekildi. Güncel bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
