package com.turgaydede.creational.abstract_factory.garanti;

import com.turgaydede.creational.abstract_factory.BankAccount;

public class GarantiSavingsAccount implements BankAccount {
    private double balance;

    public GarantiSavingsAccount() {
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Garanti Bireysel Hesabına " + amount + " TL yatırıldı. Güncel bakiye: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Garanti Bireysel Hesabından " + amount + " TL çekildi. Güncel bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
