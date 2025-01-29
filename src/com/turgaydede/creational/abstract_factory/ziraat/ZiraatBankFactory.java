package com.turgaydede.creational.abstract_factory.ziraat;

import com.turgaydede.creational.abstract_factory.BankAccount;
import com.turgaydede.creational.abstract_factory.BankFactory;

public class ZiraatBankFactory implements BankFactory {
    @Override
    public BankAccount createSavingsAccount() {
        return new ZiraatSavingsAccount();
    }

    @Override
    public BankAccount createBusinessAccount() {
        return new ZiraatBusinessAccount();
    }
}
