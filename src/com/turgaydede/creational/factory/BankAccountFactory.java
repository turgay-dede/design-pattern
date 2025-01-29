package com.turgaydede.creational.factory;

public class BankAccountFactory {
    public static BankAccount createAccount(AccountType accountType) {
        if (accountType.equals(AccountType.SAVINGS)) {
            return new SavingsAccount();
        } else if (accountType.equals(AccountType.BUSINESS)) {
            return new BusinessAccount();
        } else {
            throw new IllegalArgumentException("Geçersiz hesap türü: " + accountType);
        }
    }
}
