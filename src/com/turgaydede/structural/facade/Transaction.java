package com.turgaydede.structural.facade;

public class Transaction {
    public void recordTransaction(String type, double amount) {
        System.out.println("İşlem kaydedildi: " + type + " - Tutar: " + amount + " TL");
    }
}
