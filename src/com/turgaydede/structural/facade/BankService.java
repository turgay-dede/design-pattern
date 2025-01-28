package com.turgaydede.structural.facade;

public class BankService {
    private Account account;
    private Loan loan;
    private Transaction transaction;

    public BankService(double initialBalance) {
        this.account = new Account(initialBalance);
        this.loan = new Loan();
        this.transaction = new Transaction();
    }

    public void deposit(double amount) {
        if (account.deposit(amount)) {
            transaction.recordTransaction("Para Yatırma", amount);
        }
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            transaction.recordTransaction("Para Çekme", amount);
        }
    }

    public void applyForLoan(String customerId, double amount) {
        if (loan.applyForLoan(customerId, amount)) {
            transaction.recordTransaction("Kredi Başvurusu", amount);
        }
    }

    public double getBalance() {
        return account.getBalance();
    }
}
