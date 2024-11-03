package com.turgaydede.behavioral.mediator.bank;

import com.turgaydede.behavioral.mediator.bank.service.BalanceManager;

public class SimpleBalanceManager implements BalanceManager {
    private double balance = 1000;

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void updateBalance(double amount) {
        balance += amount;
    }
}
