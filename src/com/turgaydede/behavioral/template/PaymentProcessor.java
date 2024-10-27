package com.turgaydede.behavioral.template;

public abstract class PaymentProcessor {
    public final void processPayment(double amount) {
        validatePaymentDetails();
        makePayment(amount);
        confirmPayment();
    }

    protected abstract void validatePaymentDetails();
    protected abstract void makePayment(double amount);

    private void confirmPayment() {
        System.out.println("Ödeme onaylandı.");
    }
}
