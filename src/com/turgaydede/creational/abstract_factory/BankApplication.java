package com.turgaydede.creational.abstract_factory;

import com.turgaydede.creational.abstract_factory.garanti.GarantiBankFactory;
import com.turgaydede.creational.abstract_factory.ziraat.ZiraatBankFactory;

public class BankApplication {
    public static void main(String[] args) {

        BankFactory garantiFactory = new GarantiBankFactory();
        BankAccount garantiSavings = garantiFactory.createSavingsAccount();
        garantiSavings.deposit(5000);

        System.out.println("-------------------------------");


        BankFactory ziraatFactory = new ZiraatBankFactory();
        BankAccount ziraatBusiness = ziraatFactory.createBusinessAccount();
        ziraatBusiness.deposit(20000);
    }
}
