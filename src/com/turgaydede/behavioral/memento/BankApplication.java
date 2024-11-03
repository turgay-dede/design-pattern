package com.turgaydede.behavioral.memento;

public class BankApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        AccountHistory history = new AccountHistory();

        history.save(account);
        account.deposit(500);

        history.save(account);
        account.withdraw(200);

        history.save(account);
        account.withdraw(300);

        System.out.println("\nSon işlemi geri alıyoruz...");
        history.undo(account);

        System.out.println("\nBir önceki işlemi daha geri alıyoruz...");
        history.undo(account);
    }
}
