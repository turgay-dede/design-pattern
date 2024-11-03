package com.turgaydede.behavioral.iterator;

public class BankAccountIterator implements Iterator<BankAccount> {
    private BankAccount[] accounts;
    private int position = 0;

    public BankAccountIterator(BankAccount[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean hasNext() {
        return position < accounts.length && accounts[position] != null;
    }

    @Override
    public BankAccount next() {
        return accounts[position++];
    }
}
