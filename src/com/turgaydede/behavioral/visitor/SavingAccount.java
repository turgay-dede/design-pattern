package com.turgaydede.behavioral.visitor;

public class SavingAccount implements Account {
    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        visitor.visit(this);
    }
}
