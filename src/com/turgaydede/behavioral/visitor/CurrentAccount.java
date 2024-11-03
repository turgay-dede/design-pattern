package com.turgaydede.behavioral.visitor;

public class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double balance) {
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
