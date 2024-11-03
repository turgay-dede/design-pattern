package com.turgaydede.behavioral.observer;

public class SecuritySystem implements Observer {
    @Override
    public void update(double balance) {
        if (balance > 10000) {
            System.out.println("Güvenlik Sistemi: Hesap bakiyesinde yüksek bir değişiklik oldu. Güncel bakiye: " + balance + " TL");
        }
    }
}
