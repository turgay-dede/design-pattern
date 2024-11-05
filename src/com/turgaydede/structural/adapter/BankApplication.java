package com.turgaydede.structural.adapter;

public class BankApplication {
    public static void main(String[] args) {
        ExternalCreditScoreService externalService = new ExternalCreditScoreService();

        CreditScore creditScore = new CreditScoreAdapter(externalService);

        String customerId = "12345";
        int score = creditScore.getScore(customerId);

        System.out.println("Müşteri Kredi Skoru: " + score);
        
        if (score > 700) {
            System.out.println("Kredi başvurusu onaylandı.");
        } else {
            System.out.println("Kredi başvurusu reddedildi.");
        }
    }
}
