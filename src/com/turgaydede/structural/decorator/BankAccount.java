package com.turgaydede.structural.decorator;

public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
