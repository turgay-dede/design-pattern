package com.turgaydede.behavioral.observer;

public class SmsNotifier implements Observer {
    @Override
    public void update(double balance) {
        System.out.println("SMS Bildirimi: Hesabınızda bir değişiklik oldu. Güncel bakiye: " + balance + " TL");
    }
}
