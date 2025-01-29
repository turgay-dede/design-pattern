package com.turgaydede.structural.decorator;

public class BankApplication {
    public static void main(String[] args) {

        BankAccount basicAccount = new BasicAccount(5000);

        BankAccount smsAccount = new SmsNotificationDecorator(basicAccount);
        smsAccount.deposit(1000);
        smsAccount.withdraw(500);

        System.out.println("\nSigortalı ve Kredi Takipli Hesap:");

        BankAccount insuredAccount = new InsuranceDecorator(new CreditScoreMonitoringDecorator(basicAccount));


        ((InsuranceDecorator) insuredAccount).provideInsurance();
        ((CreditScoreMonitoringDecorator) ((InsuranceDecorator) insuredAccount).decoratedAccount).monitorCreditScore();
    }
}
