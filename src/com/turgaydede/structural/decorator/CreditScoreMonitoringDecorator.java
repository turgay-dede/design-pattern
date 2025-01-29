package com.turgaydede.structural.decorator;

public class CreditScoreMonitoringDecorator extends AccountDecorator {

    public CreditScoreMonitoringDecorator(BankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    public void monitorCreditScore() {
        System.out.println("Kredi puanı takibi yapılıyor.");
    }
}
