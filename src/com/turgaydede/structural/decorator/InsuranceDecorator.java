package com.turgaydede.structural.decorator;

public class InsuranceDecorator extends AccountDecorator {

    public InsuranceDecorator(BankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    public void provideInsurance() {
        System.out.println("Hesap için sigorta sağlandı.");
    }
}
