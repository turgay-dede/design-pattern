package com.turgaydede.behavioral.mediator.bank.service;

public interface BankMediator {
    boolean authenticate(String accountNumber);
    boolean checkLimit(double amount);
    boolean checkBalance(double amount);
    void withdraw(double amount);
}
