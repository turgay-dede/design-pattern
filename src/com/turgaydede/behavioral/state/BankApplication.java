package com.turgaydede.behavioral.state;

public class BankApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(500);
        account.withdraw(200);

        System.out.println("********************************************************");

        account.freezeAccount();
        account.deposit(300);
        account.withdraw(100);

        System.out.println("********************************************************");

        account.closeAccount();
        account.deposit(100);
        account.withdraw(50);

        System.out.println("********************************************************");

        account.openAccount();
        account.deposit(100);
        account.withdraw(50);
    }
}
