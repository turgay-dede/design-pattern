package com.turgaydede.creational.factory;

public class SavingsAccount implements BankAccount {
    private double balance;

    public SavingsAccount() {
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Tasarruf hesabına " + amount + " TL yatırıldı. Güncel bakiye: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Tasarruf hesabından " + amount + " TL çekildi. Güncel bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
