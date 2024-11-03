package com.turgaydede.behavioral.strategy.bank;

public class BankAccount {
    private double balance;
    private InterestStrategy interestStrategy;

    public BankAccount(double balance, CustomerType customerType) {
        this.balance = balance;
        this.interestStrategy = customerType.getInterestStrategy();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return interestStrategy.calculateInterest(balance);
    }

    public void setInterestStrategy(InterestStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }
}
