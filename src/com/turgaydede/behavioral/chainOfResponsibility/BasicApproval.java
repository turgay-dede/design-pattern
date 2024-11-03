package com.turgaydede.behavioral.chainOfResponsibility;

public class BasicApproval implements ApprovalHandler {
    private ApprovalHandler nextHandler;

    @Override
    public void setNextHandler(ApprovalHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void approveLoan(double amount) {
        if (amount <= 10000) {
            System.out.println("Temel Onay: " + amount + " TL kredi başvurusu onaylandı.");
        } else if (nextHandler != null) {
            System.out.println("Temel Onay: " + amount + " TL kredi üst limitte, bir sonraki onay seviyesine yönlendiriliyor.");
            nextHandler.approveLoan(amount);
        }
    }
}
