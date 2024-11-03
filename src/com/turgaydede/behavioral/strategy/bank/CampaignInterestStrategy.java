package com.turgaydede.behavioral.strategy.bank;

public class CampaignInterestStrategy implements InterestStrategy {
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.07;
    }
}
