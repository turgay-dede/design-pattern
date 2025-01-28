package com.turgaydede.structural.bridge;

public class DigitalWalletPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Dijital cüzdanla " + amount + " TL ödendi.");
    }
}
