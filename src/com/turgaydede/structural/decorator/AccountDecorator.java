package com.turgaydede.structural.decorator;

public abstract class AccountDecorator implements BankAccount {
    protected BankAccount decoratedAccount;

    public AccountDecorator(BankAccount decoratedAccount) {
        this.decoratedAccount = decoratedAccount;
    }

    @Override
    public void deposit(double amount) {
        decoratedAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        decoratedAccount.withdraw(amount);
    }

    @Override
    public double getBalance() {
        return decoratedAccount.getBalance();
    }
}
