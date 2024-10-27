package com.turgaydede.behavioral.template;

public class PaymentApplication {

    public static void main(String[] args) {
        PaymentProcessor creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(250);

        System.out.println();

        PaymentProcessor bankTransferPayment = new BankTransferPayment();
        bankTransferPayment.processPayment(500);

        System.out.println();

        PaymentProcessor mobilePayment = new MobilePayment();
        mobilePayment.processPayment(100);
    }
}
