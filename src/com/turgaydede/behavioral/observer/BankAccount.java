package com.turgaydede.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<Observer> observers = new ArrayList<>();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " TL hesaba yatırıldı. Güncel bakiye: " + balance + " TL");
        notifyObservers();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " TL hesaptan çekildi. Güncel bakiye: " + balance + " TL");
            notifyObservers();
        } else {
            System.out.println("Yetersiz bakiye. İşlem gerçekleştirilemedi.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
