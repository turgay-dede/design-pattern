package com.turgaydede.structural.bridge;

public abstract class Account {
    protected PaymentMethod paymentMethod;

    public Account(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract void makePayment(double amount);
}
