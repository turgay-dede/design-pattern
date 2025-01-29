package com.turgaydede.structural.composite;

public class BankApplication {
    public static void main(String[] args) {
        BankEmployee emp1 = new BankEmployee("E001", "Ali Yılmaz", "Müşteri Temsilcisi");
        BankEmployee emp2 = new BankEmployee("E002", "Ayşe Demir", "Kredi Uzmanı");
        BankEmployee emp3 = new BankEmployee("E003", "Mehmet Çelik", "Gişe Görevlisi");
        BankEmployee emp4 = new BankEmployee("E004", "Zeynep Kaya", "Bölge Müdürü");

        BankBranch subBranch = new BankBranch("B002", "Çankaya Şubesi");
        subBranch.addComponent(emp1);
        subBranch.addComponent(emp2);

        BankBranch mainBranch = new BankBranch("B001", "Merkez Şubesi");
        mainBranch.addComponent(subBranch);
        mainBranch.addComponent(emp3);
        mainBranch.addComponent(emp4);

        System.out.println("Banka Yapısı:");
        mainBranch.showDetails();
    }
}
