package com.turgaydede.behavioral.mediator.bank.service;

public interface BalanceManager {
    double getBalance();
    void updateBalance(double amount);
}