package com.turgaydede.behavioral.chainOfResponsibility;

public class RegionalManagerApproval implements ApprovalHandler {
    private ApprovalHandler nextHandler;

    @Override
    public void setNextHandler(ApprovalHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void approveLoan(double amount) {
        if (amount <= 50000) {
            System.out.println("Bölge Müdürü Onayı: " + amount + " TL kredi başvurusu onaylandı.");
        } else if (nextHandler != null) {
            System.out.println("Bölge Müdürü Onayı: " + amount + " TL kredi üst limitte, bir sonraki onay seviyesine yönlendiriliyor.");
            nextHandler.approveLoan(amount);
        }
    }
}