package com.turgaydede.behavioral.mediator.bank.service;

public interface TransactionLimit {
    boolean checkLimit(double amount);
}