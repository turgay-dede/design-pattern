package com.turgaydede.structural.proxy;

public class BankApplication {
    public static void main(String[] args) {
        BankAccount adminAccount = new BankAccountProxy(5000, "ADMIN");
        BankAccount guestAccount = new BankAccountProxy(5000, "GUEST");

        System.out.println("ADMIN Kullanıcısı İşlemleri:");
        adminAccount.deposit(1000);
        adminAccount.withdraw(2000);
        System.out.println("Güncel Bakiye (ADMIN): " + adminAccount.getBalance());

        System.out.println("\nGUEST Kullanıcısı İşlemleri:");
        guestAccount.deposit(500);
        guestAccount.withdraw(300);
        System.out.println("Güncel Bakiye (GUEST): " + guestAccount.getBalance());
    }
}
