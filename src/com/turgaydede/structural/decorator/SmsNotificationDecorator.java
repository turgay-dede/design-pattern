package com.turgaydede.structural.decorator;

public class SmsNotificationDecorator extends AccountDecorator {

    public SmsNotificationDecorator(BankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        sendSms("Hesaba " + amount + " TL yatırıldı.");
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        sendSms("Hesaptan " + amount + " TL çekildi.");
    }

    private void sendSms(String message) {
        System.out.println("SMS Gönderildi: " + message);
    }
}
