package com.turgaydede.structural.proxy;

public class BankAccountProxy implements BankAccount {
    private RealBankAccount realBankAccount;
    private String userRole;

    public BankAccountProxy(double initialBalance, String userRole) {
        this.realBankAccount = new RealBankAccount(initialBalance);
        this.userRole = userRole;
    }

    private boolean hasAccess() {
        return "ADMIN".equals(userRole);
    }

    @Override
    public void deposit(double amount) {
        if (hasAccess()) {
            realBankAccount.deposit(amount);
        } else {
            System.out.println("Erişim reddedildi: Yalnızca yetkili kullanıcılar bu işlemi yapabilir.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (hasAccess()) {
            realBankAccount.withdraw(amount);
        } else {
            System.out.println("Erişim reddedildi: Yalnızca yetkili kullanıcılar bu işlemi yapabilir.");
        }
    }

    @Override
    public double getBalance() {
        if (hasAccess()) {
            return realBankAccount.getBalance();
        } else {
            System.out.println("Erişim reddedildi: Yalnızca yetkili kullanıcılar bakiyeyi görüntüleyebilir.");
            return 0;
        }
    }
}
