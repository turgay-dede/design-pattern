package com.turgaydede.behavioral.memento;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountMemento save() {
        return new AccountMemento(balance);
    }

    public void restore(AccountMemento memento) {
        this.balance = memento.getBalance();
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " TL hesaba yatırıldı. Güncel bakiye: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " TL hesaptan çekildi. Güncel bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye. İşlem gerçekleştirilemedi.");
        }
    }
}
