package com.turgaydede.behavioral.state;

public class ClosedState implements AccountState {
    private BankAccount account;

    public ClosedState(BankAccount account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Kapalı Durum: Hesap kapalı, para yatırma işlemi yapılamaz.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Kapalı Durum: Hesap kapalı, para çekme işlemi yapılamaz.");
    }

    @Override
    public void freezeAccount() {
        System.out.println("Kapalı Durum: Hesap kapalı, dondurma işlemi yapılamaz.");
    }

    @Override
    public void closeAccount() {
        System.out.println("Kapalı Durum: Hesap zaten kapalı.");
    }


    @Override
    public void openAccount() {
        account.setState(new ActiveState(account));
        System.out.println("Kapalı Durum: Hesap açıldı ve aktif duruma geçirildi.");
    }
}
