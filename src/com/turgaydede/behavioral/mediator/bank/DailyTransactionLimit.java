package com.turgaydede.behavioral.mediator.bank;

import com.turgaydede.behavioral.mediator.bank.service.TransactionLimit;

public class DailyTransactionLimit implements TransactionLimit {
    @Override
    public boolean checkLimit(double amount) {
        System.out.println("Günlük işlem limiti kontrol edildi.");
        return amount <= 500;
    }
}