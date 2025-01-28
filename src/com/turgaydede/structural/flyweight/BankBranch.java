package com.turgaydede.structural.flyweight;

public class BankBranch implements BankBranchFlyweight {
    private final String branchName;
    private final String branchAddress;
    private final String bankCode;

    public BankBranch(String branchName, String branchAddress, String bankCode) {
        this.branchName = branchName;
        this.branchAddress = branchAddress;
        this.bankCode = bankCode;
    }

    @Override
    public void displayCustomerInfo(String customerId, String customerName, double accountBalance) {
        System.out.println("Müşteri ID: " + customerId);
        System.out.println("Müşteri Adı: " + customerName);
        System.out.println("Hesap Bakiyesi: " + accountBalance + " TL");
        System.out.println("Şube: " + branchName + ", Adres: " + branchAddress + ", Banka Kodu: " + bankCode);
        System.out.println("---------------------------------------------------");
    }
}
