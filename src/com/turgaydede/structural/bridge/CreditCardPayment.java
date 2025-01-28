package com.turgaydede.structural.bridge;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Kredi kartıyla " + amount + " TL ödendi.");
    }
}
