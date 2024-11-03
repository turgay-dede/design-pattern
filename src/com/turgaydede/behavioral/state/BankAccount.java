package com.turgaydede.behavioral.state;

public class BankAccount {
    private AccountState state;
    private double balance;

    public BankAccount() {
        this.state = new ActiveState(this);
        this.balance = 0.0;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        state.deposit(amount);
    }

    public void withdraw(double amount) {
        state.withdraw(amount);
    }

    public void freezeAccount() {
        state.freezeAccount();
    }

    public void closeAccount() {
        state.closeAccount();
    }

    public void openAccount() {
        state.openAccount();
    }
}
