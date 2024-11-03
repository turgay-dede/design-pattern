package com.turgaydede.behavioral.memento;

import java.util.Stack;

public class AccountHistory {
    private Stack<AccountMemento> history = new Stack<>();

    public void save(BankAccount account) {
        history.push(account.save());
    }

    public void undo(BankAccount account) {
        if (!history.isEmpty()) {
            account.restore(history.pop());
            System.out.println("İşlem geri alındı. Güncel bakiye: " + account.getBalance());
        } else {
            System.out.println("Geri alınacak işlem yok.");
        }
    }
}
