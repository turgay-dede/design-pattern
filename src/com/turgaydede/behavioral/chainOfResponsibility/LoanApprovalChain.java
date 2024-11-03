package com.turgaydede.behavioral.chainOfResponsibility;

public class LoanApprovalChain {
    public static void main(String[] args) {
        ApprovalHandler basicApproval = new BasicApproval();
        ApprovalHandler regionalManagerApproval = new RegionalManagerApproval();
        ApprovalHandler directorApproval = new DirectorApproval();
        ApprovalHandler executiveCommitteeApproval = new ExecutiveCommitteeApproval();

        basicApproval.setNextHandler(regionalManagerApproval);
        regionalManagerApproval.setNextHandler(directorApproval);
        directorApproval.setNextHandler(executiveCommitteeApproval);

        System.out.println("10.000 TL kredi başvurusu:");
        basicApproval.approveLoan(10000);

        System.out.println("\n30.000 TL kredi başvurusu:");
        basicApproval.approveLoan(30000);

        System.out.println("\n200.000 TL kredi başvurusu:");
        basicApproval.approveLoan(200000);

        System.out.println("\n500.000 TL kredi başvurusu:");
        basicApproval.approveLoan(500000);
    }
}
