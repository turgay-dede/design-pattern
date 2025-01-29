package com.turgaydede.creational.abstract_factory;

public interface BankFactory {
    BankAccount createSavingsAccount();
    BankAccount createBusinessAccount();
}
