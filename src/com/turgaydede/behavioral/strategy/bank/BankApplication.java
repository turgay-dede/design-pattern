package com.turgaydede.behavioral.strategy.bank;

public class BankApplication {
    public static void main(String[] args) {
        BankAccount standardAccount = new BankAccount(10000, CustomerType.STANDARD);
        System.out.println("Standart müşteri bakiyesi: " + standardAccount.getBalance() + " TL");
        System.out.println("Yıllık faiz (Standart): " + standardAccount.calculateInterest() + " TL");

        BankAccount premiumAccount = new BankAccount(10000, CustomerType.PREMIUM);
        System.out.println("\nPremium müşteri bakiyesi: " + premiumAccount.getBalance() + " TL");
        System.out.println("Yıllık faiz (Premium): " + premiumAccount.calculateInterest() + " TL");

        BankAccount campaignAccount = new BankAccount(10000, CustomerType.CAMPAIGN);
        System.out.println("\nKampanya müşterisi bakiyesi: " + campaignAccount.getBalance() + " TL");
        System.out.println("Yıllık faiz (Kampanya): " + campaignAccount.calculateInterest() + " TL");
    }
}
