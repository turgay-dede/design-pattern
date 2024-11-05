package com.turgaydede.structural.adapter;

public class CreditScoreAdapter implements CreditScore {
    private final ExternalCreditScoreService externalService;

    public CreditScoreAdapter(ExternalCreditScoreService externalService) {
        this.externalService = externalService;
    }

    @Override
    public int getScore(String customerId) {
        double score = externalService.fetchCreditScore(customerId);

        return (int) (score * 1000);
    }
}
