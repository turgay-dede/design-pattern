package com.turgaydede.behavioral.state;

public class ActiveState implements AccountState {
    private BankAccount account;

    public ActiveState(BankAccount account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Aktif Durum: " + amount + " TL hesaba yatırıldı. Güncel bakiye: " + account.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Aktif Durum: " + amount + " TL hesaptan çekildi. Güncel bakiye: " + account.getBalance());
        } else {
            System.out.println("Aktif Durum: Yetersiz bakiye!");
        }
    }

    @Override
    public void freezeAccount() {
        account.setState(new FrozenState(account));
        System.out.println("Hesap donduruldu.");
    }

    @Override
    public void closeAccount() {
        account.setState(new ClosedState(account));
        System.out.println("Hesap kapatıldı.");
    }

    @Override
    public void openAccount() {
        System.out.println("Aktif Durum: Hesap zaten açık.");
    }
}
