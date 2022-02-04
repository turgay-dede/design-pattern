package com.creational.prototype;

public class AccountFactory implements FactoryService{

    @Override
    public Account createNormalAccount() {
         return (Account) AccountPrototypes.normalPrototype.clone();
    }

    @Override
    public Account createNormalAccount(Customer owner, double balance, String iban) {
         Account account = (Account) AccountPrototypes.normalPrototype.clone();
         account.setOwner(owner);
         account.setBalance(balance);
         account.setIban(iban);
         return  account;
    }

    @Override
    public Account createNegativeAccount(Customer owner, double balance, String iban) {
        Account account = (Account) AccountPrototypes.negativePrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        account.setIban(iban);
        return  account;
    }

    @Override
    public Account createFrozenAccount(Customer owner, double balance, String iban) {
        Account account = (Account) AccountPrototypes.frozenPrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        account.setIban(iban);
        return  account;
    }
    static class AccountPrototypes{
        static Account normalPrototype = new Account("123456",500,500,null,true,true,true);
        static Account negativePrototype = new Account("123456",0,500,null,true,true,false);
        static Account frozenPrototype = new Account("123456",-500,500,null,false,false,false);

    }
}
