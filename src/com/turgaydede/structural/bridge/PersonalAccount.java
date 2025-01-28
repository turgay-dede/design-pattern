package com.turgaydede.structural.bridge;

public class PersonalAccount extends Account {

    public PersonalAccount(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void makePayment(double amount) {
        System.out.print("Bireysel Hesap: ");
        paymentMethod.pay(amount);
    }
}
