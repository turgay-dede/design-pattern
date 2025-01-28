package com.turgaydede.structural.flyweight;

public class ATMBranch implements BankBranchFlyweight {
    private final String atmLocation;
    private final String bankCode;

    public ATMBranch(String atmLocation, String bankCode) {
        this.atmLocation = atmLocation;
        this.bankCode = bankCode;
    }

    @Override
    public void displayCustomerInfo(String customerId, String customerName, double accountBalance) {
        System.out.println("Müşteri ID: " + customerId);
        System.out.println("Müşteri Adı: " + customerName);
        System.out.println("Hesap Bakiyesi: " + accountBalance + " TL");
        System.out.println("Şube Türü: ATM Şubesi");
        System.out.println("ATM Lokasyonu: " + atmLocation + ", Banka Kodu: " + bankCode);
        System.out.println("---------------------------------------------------");
    }
}
