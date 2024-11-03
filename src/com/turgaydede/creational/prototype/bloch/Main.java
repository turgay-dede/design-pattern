package com.turgaydede.creational.prototype.bloch;

import com.turgaydede.creational.prototype.Customer;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Normal Account ---");

        Account normalAccount = Account.createNormalAccount(new Customer("Turgay", "Dede"), 2000, "1234567890");
        System.out.println(normalAccount);
        System.out.println(normalAccount.isOpenToWithdraw());
        System.out.println(normalAccount.isOpenToPayment());
        System.out.println(normalAccount.isOpenToTransfer());

        System.out.println("--- Negative Account ---");

        Account negativeAccount = Account.createNegativeAccount(new Customer("John", "Doe"), -250, "748623");
        System.out.println(negativeAccount);
        System.out.println(negativeAccount.isOpenToWithdraw());
        System.out.println(negativeAccount.isOpenToPayment());
        System.out.println(negativeAccount.isOpenToTransfer());

        System.out.println("--- Frozen Account ---");

        Account frozenAccount = Account.createFrozenAccount(new Customer("Alice", "Smith"), 0, "3652148");
        System.out.println(frozenAccount);
        System.out.println(frozenAccount.isOpenToWithdraw());
        System.out.println(frozenAccount.isOpenToPayment());
        System.out.println(frozenAccount.isOpenToTransfer());
    }
}
