package com.turgaydede.structural.facade;

public class Loan {
    public boolean applyForLoan(String customerId, double amount) {
        System.out.println("Kredi başvurusu yapıldı: Müşteri ID: " + customerId + ", Miktar: " + amount);
        return true;
    }
}
