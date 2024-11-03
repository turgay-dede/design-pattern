package com.turgaydede.behavioral.visitor;

public class InterestCalculatorVisitor implements AccountVisitor {

    @Override
    public void visit(SavingAccount savingAccount) {
        double interest = savingAccount.getBalance() * 0.04; // Örneğin, %4 faiz oranı
        System.out.println("Faiz Hesaplama: Tasarruf hesabında yıllık faiz: " + interest);
    }

    @Override
    public void visit(CurrentAccount currentAccount) {
        double interest = currentAccount.getBalance() * 0.02; // Örneğin, %2 faiz oranı
        System.out.println("Faiz Hesaplama: Cari hesabında yıllık faiz: " + interest);
    }

    @Override
    public void visit(LoanAccount loanAccount) {
        double interest = loanAccount.getLoanAmount() * 0.08; // Örneğin, %8 faiz oranı
        System.out.println("Faiz Hesaplama: Kredi hesabında yıllık faiz: " + interest);
    }
}
