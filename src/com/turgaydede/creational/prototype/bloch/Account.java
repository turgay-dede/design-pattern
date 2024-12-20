package com.turgaydede.creational.prototype.bloch;

import com.turgaydede.creational.prototype.Customer;

public class Account implements Cloneable {
    protected String iban;
    protected double balance;
    protected double credit;
    protected Customer owner;

    private boolean openToWithdraw;
    private boolean openToPayment;
    private boolean openToTransfer;

    private final static Account normalPrototype = new Account("123456", 500, 500, null, true, true, true);
    private final static Account negativePrototype = new Account("123456", 0, 500, null, true, true, false);
    private final static Account frozenPrototype = new Account("123456", -500, 500, null, false, false, false);

    private Account(String iban, double balance, double credit, Customer owner, boolean openToWithdraw, boolean openToPayment, boolean openToTransfer) {
        this.iban = iban;
        this.balance = balance;
        this.credit = credit;
        this.owner = owner;
        this.openToWithdraw = openToWithdraw;
        this.openToPayment = openToPayment;
        this.openToTransfer = openToTransfer;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public boolean isOpenToWithdraw() {
        return openToWithdraw;
    }

    public void setOpenToWithdraw(boolean openToWithdraw) {
        this.openToWithdraw = openToWithdraw;
    }

    public boolean isOpenToPayment() {
        return openToPayment;
    }

    public void setOpenToPayment(boolean openToPayment) {
        this.openToPayment = openToPayment;
    }

    public boolean isOpenToTransfer() {
        return openToTransfer;
    }

    public void setOpenToTransfer(boolean openToTransfer) {
        this.openToTransfer = openToTransfer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner=" + owner +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                ", credit=" + credit +
                ", openToWithdraw=" + openToWithdraw +
                ", openToPayment=" + openToPayment +
                ", openToTransfer=" + openToTransfer +
                '}';
    }

    @Override
    protected Account clone() {
        Account account = null;
        try {
            account = (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return account;
    }

    public static Account createNormalAccount(Customer owner, double balance, String iban) {
        Account account = normalPrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        account.setIban(iban);
        return account;
    }

    public static Account createNegativeAccount(Customer owner, double balance, String iban) {
        Account account = negativePrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        account.setIban(iban);
        return account;
    }

    public static Account createFrozenAccount(Customer owner, double balance, String iban) {
        Account account = frozenPrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        account.setIban(iban);
        return account;
    }

}
