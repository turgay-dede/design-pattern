package com.turgaydede.behavioral.visitor;

public class AccountSummaryVisitor implements AccountVisitor {

    @Override
    public void visit(SavingAccount savingAccount) {
        System.out.println("Hesap Özeti: Tasarruf Hesabı - Bakiye: " + savingAccount.getBalance());
    }

    @Override
    public void visit(CurrentAccount currentAccount) {
        System.out.println("Hesap Özeti: Cari Hesap - Bakiye: " + currentAccount.getBalance());
    }

    @Override
    public void visit(LoanAccount loanAccount) {
        System.out.println("Hesap Özeti: Kredi Hesabı - Borç: " + loanAccount.getLoanAmount());
    }
}
