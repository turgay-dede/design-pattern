package com.turgaydede.behavioral.mediator.bank;

import com.turgaydede.behavioral.mediator.bank.service.AccountAuthentication;
import com.turgaydede.behavioral.mediator.bank.service.BalanceManager;
import com.turgaydede.behavioral.mediator.bank.service.BankMediator;
import com.turgaydede.behavioral.mediator.bank.service.TransactionLimit;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        AccountAuthentication authentication = new SimpleAccountAuthentication();
        TransactionLimit transactionLimit = new DailyTransactionLimit();
        BalanceManager balanceManager = new SimpleBalanceManager();

        BankMediator mediator = new BankTransactionMediator(authentication, transactionLimit, balanceManager);
        BankFacade bankFacade = new BankFacade(mediator);

        bankFacade.withdrawMoney("12345", 200);
    }
}
