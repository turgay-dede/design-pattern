package com.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Database instance1 = Database.getInstance();
        Database instance2 = Database.getInstance();
        System.out.println(instance1==instance2); // true

        DatabaseBillPugh instance3 = DatabaseBillPugh.getInstance();
        DatabaseBillPugh instance4 = DatabaseBillPugh.getInstance();
        System.out.println(instance3==instance4); // true

        DatabaseEnum instance5 = DatabaseEnum.getInstance();
        DatabaseEnum instance6 = DatabaseEnum.getInstance();
        System.out.println(instance5==instance6); // true

    }
}
