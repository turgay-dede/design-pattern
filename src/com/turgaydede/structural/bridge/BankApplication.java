package com.turgaydede.structural.bridge;

public class BankApplication {
    public static void main(String[] args) {

        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod debitCard = new DebitCardPayment();
        PaymentMethod digitalWallet = new DigitalWalletPayment();

        Account personalAccount1 = new PersonalAccount(creditCard);
        personalAccount1.makePayment(1000);

        Account personalAccount2 = new PersonalAccount(digitalWallet);
        personalAccount2.makePayment(500);

        Account businessAccount1 = new BusinessAccount(debitCard);
        businessAccount1.makePayment(2000);

        Account businessAccount2 = new BusinessAccount(creditCard);
        businessAccount2.makePayment(1500);
    }
}
