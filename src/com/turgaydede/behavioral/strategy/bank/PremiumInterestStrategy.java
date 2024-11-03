package com.turgaydede.behavioral.strategy.bank;

public class PremiumInterestStrategy implements InterestStrategy {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.05;
    }
}
