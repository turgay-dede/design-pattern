package com.turgaydede.behavioral.observer;

public class EmailNotifier implements Observer {
    @Override
    public void update(double balance) {
        System.out.println("E-Posta Bildirimi: Hesap bakiyenizde değişiklik var. Güncel bakiye: " + balance + " TL");
    }
}
