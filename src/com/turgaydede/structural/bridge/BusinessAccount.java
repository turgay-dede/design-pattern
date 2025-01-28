package com.turgaydede.structural.bridge;

public class BusinessAccount extends Account {

    public BusinessAccount(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void makePayment(double amount) {
        System.out.print("Kurumsal Hesap: ");
        paymentMethod.pay(amount);
    }
}
