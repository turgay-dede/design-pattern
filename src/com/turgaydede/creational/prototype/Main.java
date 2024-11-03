package com.turgaydede.creational.prototype;

public class Main {
    public static void main(String[] args) {
        FactoryService factoryService = new AccountFactory();

        System.out.println("--- Normal Account ---");
        Account normalAccount = factoryService.createNormalAccount(new Customer("Turgay","Dede"),1000,"282828");
        System.out.println(normalAccount);
        System.out.println(normalAccount.isOpenToWithdraw());
        System.out.println(normalAccount.isOpenToPayment());
        System.out.println(normalAccount.isOpenToTransfer());

        System.out.println("--- Negative Account ---");
        Account negativeAccount = factoryService.createNegativeAccount(new Customer("John","Doe"),-250,"748623");
        System.out.println(negativeAccount);
        System.out.println(negativeAccount.isOpenToWithdraw());
        System.out.println(negativeAccount.isOpenToPayment());
        System.out.println(negativeAccount.isOpenToTransfer());

        System.out.println("--- Frozen Account ---");
        Account frozenAccount = factoryService.createFrozenAccount(new Customer("Alice","Smith"),0,"3652148");
        System.out.println(frozenAccount);
        System.out.println(frozenAccount.isOpenToWithdraw());
        System.out.println(frozenAccount.isOpenToPayment());
        System.out.println(frozenAccount.isOpenToTransfer());

    }
}
