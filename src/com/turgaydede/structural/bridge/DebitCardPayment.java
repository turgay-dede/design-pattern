package com.turgaydede.structural.bridge;

public class DebitCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Banka kartıyla " + amount + " TL ödendi.");
    }
}
