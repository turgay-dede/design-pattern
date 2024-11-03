package com.turgaydede.behavioral.observer;

public class BankApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        Observer smsNotifier = new SmsNotifier();
        Observer emailNotifier = new EmailNotifier();
        Observer securitySystem = new SecuritySystem();

        account.addObserver(smsNotifier);
        account.addObserver(emailNotifier);
        account.addObserver(securitySystem);

        System.out.println("\n--- Para Yatırma İşlemi ---");
        account.deposit(6000);  // 6000 TL yatırma

        System.out.println("\n--- Para Çekme İşlemi ---");
        account.withdraw(2000);  // 2000 TL çekme

        System.out.println("\n--- Büyük Miktarda Para Çekme ---");
        account.withdraw(15000); // 15000 TL çekme
    }
}
