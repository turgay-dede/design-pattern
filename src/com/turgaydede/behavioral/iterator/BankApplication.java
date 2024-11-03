package com.turgaydede.behavioral.iterator;

public class BankApplication {
    public static void main(String[] args) {
        BankAccountCollection accountCollection = new BankAccountCollection(5);

        accountCollection.addAccount(new BankAccount("12345", 5000));
        accountCollection.addAccount(new BankAccount("67890", 3000));
        accountCollection.addAccount(new BankAccount("11223", 7000));

        Iterator<BankAccount> iterator = accountCollection.createIterator();

        while (iterator.hasNext()) {
            BankAccount account = iterator.next();
            System.out.println(account);
        }
    }
}
