package com.turgaydede.behavioral.chainOfResponsibility;

public interface ApprovalHandler {
    void setNextHandler(ApprovalHandler handler);
    void approveLoan(double amount);
}
