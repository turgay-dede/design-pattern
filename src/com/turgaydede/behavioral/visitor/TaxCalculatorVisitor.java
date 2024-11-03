package com.turgaydede.behavioral.visitor;

public class TaxCalculatorVisitor implements AccountVisitor {

    @Override
    public void visit(SavingAccount savingAccount) {
        double tax = savingAccount.getBalance() * 0.01; // Örneğin, %1 vergi
        System.out.println("Vergi Hesaplama: Tasarruf hesabında vergi: " + tax);
    }

    @Override
    public void visit(CurrentAccount currentAccount) {
        double tax = currentAccount.getBalance() * 0.015; // Örneğin, %1.5 vergi
        System.out.println("Vergi Hesaplama: Cari hesapta vergi: " + tax);
    }

    @Override
    public void visit(LoanAccount loanAccount) {
        double tax = loanAccount.getLoanAmount() * 0.005; // Örneğin, %0.5 vergi
        System.out.println("Vergi Hesaplama: Kredi hesabında vergi: " + tax);
    }
}
