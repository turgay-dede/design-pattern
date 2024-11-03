package com.turgaydede.behavioral.chainOfResponsibility;

public class ExecutiveCommitteeApproval implements ApprovalHandler {
    @Override
    public void setNextHandler(ApprovalHandler handler) {
        // Bu seviye en üst düzeyde olduğu için bir sonraki işleyici yok
    }

    @Override
    public void approveLoan(double amount) {
        System.out.println("Yüksek Kredi Komitesi Onayı: " + amount + " TL kredi başvurusu onaylandı.");
    }
}
