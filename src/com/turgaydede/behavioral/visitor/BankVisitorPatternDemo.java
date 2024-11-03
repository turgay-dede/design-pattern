package com.turgaydede.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class BankVisitorPatternDemo {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingAccount(5000));
        accounts.add(new CurrentAccount(3000));
        accounts.add(new LoanAccount(10000));

        AccountVisitor interestCalculator = new InterestCalculatorVisitor();
        AccountVisitor taxCalculator = new TaxCalculatorVisitor();
        AccountVisitor accountSummaryVisitor = new AccountSummaryVisitor();


        System.out.println("Faiz Hesaplamaları:");
        for (Account account : accounts) {
            account.accept(interestCalculator);
        }

        System.out.println("\nVergi Hesaplamaları:");
        for (Account account : accounts) {
            account.accept(taxCalculator);
        }

        System.out.println("\nHesap Özeti:");
        for (Account account : accounts) {
            account.accept(accountSummaryVisitor);
        }
    }
}
