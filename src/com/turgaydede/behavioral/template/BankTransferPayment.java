package com.turgaydede.behavioral.template;

public class BankTransferPayment extends PaymentProcessor {

    @Override
    protected void validatePaymentDetails() {
        System.out.println("Banka havale bilgileri doğrulandı.");
    }

    @Override
    protected void makePayment(double amount) {
        System.out.println(amount + " TL banka hesabından havale edildi.");
    }
}
