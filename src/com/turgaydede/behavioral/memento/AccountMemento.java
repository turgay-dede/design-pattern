package com.turgaydede.behavioral.memento;

public class AccountMemento {
    private final double balance;

    public AccountMemento(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
