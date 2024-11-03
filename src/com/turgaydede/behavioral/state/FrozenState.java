package com.turgaydede.behavioral.state;

public class FrozenState implements AccountState {
    private BankAccount account;

    public FrozenState(BankAccount account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Bloke Durum: " + amount + " TL hesaba yatırıldı. Güncel bakiye: " + account.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Bloke Durum: Hesap dondurulmuş, para çekme işlemi yapılamaz.");
    }

    @Override
    public void freezeAccount() {
        System.out.println("Bloke Durum: Hesap zaten dondurulmuş.");
    }

    @Override
    public void closeAccount() {
        account.setState(new ClosedState(account));
        System.out.println("Bloke Durum: Hesap kapatıldı.");
    }

    @Override
    public void openAccount() {
        System.out.println("Bloke Durum: Hesap dondurulmuş, yeniden açılamaz.");
    }
}
