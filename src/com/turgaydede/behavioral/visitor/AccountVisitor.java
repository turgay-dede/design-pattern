package com.turgaydede.behavioral.visitor;

public interface AccountVisitor {
    void visit(SavingAccount savingAccount);
    void visit(CurrentAccount currentAccount);
    void visit(LoanAccount loanAccount);
}
