package com.turgaydede.behavioral.template;

public class MobilePayment extends PaymentProcessor {

    @Override
    protected void validatePaymentDetails() {
        System.out.println("Mobil ödeme bilgileri doğrulandı.");
    }

    @Override
    protected void makePayment(double amount) {
        System.out.println(amount + " TL mobil ödeme ile ödendi.");
    }
}
