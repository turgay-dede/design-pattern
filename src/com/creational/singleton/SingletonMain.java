package com.creational.singleton;

import java.lang.reflect.Constructor;

public class SingletonMain {
    public static void main(String[] args) {
        Database instance1 = Database.getInstance();
        Database instance2 = Database.getInstance();
        System.out.println(instance1 == instance2); // true

        DatabaseBillPugh instance3 = DatabaseBillPugh.getInstance();
        DatabaseBillPugh instance4 = DatabaseBillPugh.getInstance();
        System.out.println(instance3 == instance4); // true

        //Reflection
        Class<Database> db = Database.class;
        Constructor<Database> defaultConstructor;
        Database newDB = null;
        try {
            defaultConstructor = db.getDeclaredConstructor();
            defaultConstructor.setAccessible(true);
            newDB = defaultConstructor.newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(instance1 == newDB); //false

        //Reflection
        Class<DatabaseBillPugh> db2 = DatabaseBillPugh.class;
        Constructor<DatabaseBillPugh> defaultConstructor2;
        DatabaseBillPugh newDB2 = null;
        try {
            defaultConstructor2 = db2.getDeclaredConstructor();
            defaultConstructor2.setAccessible(true);
            newDB2 = defaultConstructor2.newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(instance3 == newDB2); //false

        //Enum
        DatabaseEnum instance5 = DatabaseEnum.getInstance();
        DatabaseEnum instance6 = DatabaseEnum.getInstance();
        System.out.println(instance5 == instance6); // true

    }
}
