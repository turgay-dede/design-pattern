package com.turgaydede.behavioral.command;

public class TransferCommand implements Command {
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;

    public TransferCommand(BankAccount fromAccount, BankAccount toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    @Override
    public void undo() {
        toAccount.withdraw(amount);
        fromAccount.deposit(amount);
    }
}