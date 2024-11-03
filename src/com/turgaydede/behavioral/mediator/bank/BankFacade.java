package com.turgaydede.behavioral.mediator.bank;

import com.turgaydede.behavioral.mediator.bank.service.BankMediator;

public class BankFacade {
    private BankMediator mediator;

    public BankFacade(BankMediator mediator) {
        this.mediator = mediator;
    }

    public void withdrawMoney(String accountNumber, double amount) {
        if (!mediator.authenticate(accountNumber)) {
            System.out.println("Kimlik doğrulama başarısız.");
            return;
        }

        if (!mediator.checkLimit(amount)) {
            System.out.println("Günlük limit aşıldı.");
            return;
        }

        if (!mediator.checkBalance(amount)) {
            System.out.println("Yetersiz bakiye.");
            return;
        }

        mediator.withdraw(amount);
    }
}
