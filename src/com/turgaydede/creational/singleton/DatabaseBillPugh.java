package com.turgaydede.creational.singleton;

public class DatabaseBillPugh {
    private DatabaseBillPugh(){} // reflection ile kırılabilir

    private static class SingletonHelper{
        private static final DatabaseBillPugh DATABASE = new DatabaseBillPugh();
    }
    public static DatabaseBillPugh getInstance(){
        return SingletonHelper.DATABASE;
    }
}
