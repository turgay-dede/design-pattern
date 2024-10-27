package com.turgaydede.behavioral.template;

public class CreditCardPayment extends PaymentProcessor {

    @Override
    protected void validatePaymentDetails() {
        System.out.println("Kredi kartı bilgileri doğrulandı.");
    }

    @Override
    protected void makePayment(double amount) {
        System.out.println(amount + " TL kredi kartından çekildi.");
    }
}
