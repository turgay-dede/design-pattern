package com.turgaydede.behavioral.iterator;

public class BankAccountCollection implements IterableCollection<BankAccount> {
    private BankAccount[] accounts;
    private int index = 0;

    public BankAccountCollection(int size) {
        accounts = new BankAccount[size];
    }

    public void addAccount(BankAccount account) {
        if (index < accounts.length) {
            accounts[index++] = account;
        }
    }

    @Override
    public Iterator<BankAccount> createIterator() {
        return new BankAccountIterator(accounts);
    }
}
