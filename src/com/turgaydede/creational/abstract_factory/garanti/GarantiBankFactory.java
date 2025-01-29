package com.turgaydede.creational.abstract_factory.garanti;

import com.turgaydede.creational.abstract_factory.BankAccount;
import com.turgaydede.creational.abstract_factory.BankFactory;

public class GarantiBankFactory implements BankFactory {
    @Override
    public BankAccount createSavingsAccount() {
        return new GarantiSavingsAccount();
    }

    @Override
    public BankAccount createBusinessAccount() {
        return new GarantiBusinessAccount();
    }
}
