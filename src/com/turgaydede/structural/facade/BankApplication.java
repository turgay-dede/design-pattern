package com.turgaydede.structural.facade;

public class BankApplication {
    public static void main(String[] args) {
        BankService bankService = new BankService(5000);

        bankService.deposit(1000);

        bankService.withdraw(2000);

        bankService.applyForLoan("12345", 10000);

        System.out.println("Güncel Bakiye: " + bankService.getBalance() + " TL");
    }
}
