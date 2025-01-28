package com.turgaydede.structural.flyweight;

public class BankApplication {
    public static void main(String[] args) {

        BankBranchFlyweight physicalBranch = BankBranchFactory.getBranch(BranchType.PHYSICAL, "Merkez Şube", "001");
        physicalBranch.displayCustomerInfo("123", "Ali Yılmaz", 5000);

        BankBranchFlyweight atmBranch = BankBranchFactory.getBranch(BranchType.ATM, "Çankaya ATM", "002");
        atmBranch.displayCustomerInfo("124", "Ayşe Demir", 3000);

        BankBranchFlyweight anotherPhysicalBranch = BankBranchFactory.getBranch(BranchType.PHYSICAL, "Merkez Şube", "001");
        anotherPhysicalBranch.displayCustomerInfo("125", "Mehmet Çelik", 7000);


        BankBranchFlyweight anotherAtmBranch = BankBranchFactory.getBranch(BranchType.ATM, "Çankaya ATM", "002");
        anotherAtmBranch.displayCustomerInfo("126", "Zeynep Kaya", 10000);
    }
}


