package com.creational.prototype;

public interface FactoryService {
    Account createNormalAccount();
    Account createNormalAccount(Customer owner,double balance,String iban);
    Account createNegativeAccount(Customer owner,double balance,String iban);
    Account createFrozenAccount(Customer owner,double balance,String iban);


}
