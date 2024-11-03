package com.turgaydede.behavioral.mediator.bank;

import com.turgaydede.behavioral.mediator.bank.service.AccountAuthentication;
import com.turgaydede.behavioral.mediator.bank.service.BalanceManager;
import com.turgaydede.behavioral.mediator.bank.service.BankMediator;
import com.turgaydede.behavioral.mediator.bank.service.TransactionLimit;

public class BankTransactionMediator implements BankMediator {
    private AccountAuthentication authentication;
    private TransactionLimit transactionLimit;
    private BalanceManager balanceManager;

    public BankTransactionMediator(AccountAuthentication authentication, TransactionLimit transactionLimit, BalanceManager balanceManager) {
        this.authentication = authentication;
        this.transactionLimit = transactionLimit;
        this.balanceManager = balanceManager;
    }

    @Override
    public boolean authenticate(String accountNumber) {
        return authentication.authenticate(accountNumber);
    }

    @Override
    public boolean checkLimit(double amount) {
        return transactionLimit.checkLimit(amount);
    }

    @Override
    public boolean checkBalance(double amount) {
        return balanceManager.getBalance() >= amount;
    }

    @Override
    public void withdraw(double amount) {
        balanceManager.updateBalance(-amount);
        System.out.println(amount + " TL çekildi. Yeni bakiye: " + balanceManager.getBalance());
    }
}
