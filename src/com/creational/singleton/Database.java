package com.creational.singleton;

import javax.xml.crypto.Data;

public class Database {
    private static volatile Database database; //volatile: memory de değiştikten sonra


    private Database() { } //reflection ile kırılabilir

    public static Database getInstance() {
        if (database == null) { // double check performans artışı
            synchronized (Database.class) {
                if (database == null) {
                    database = new Database();
                }
            }
        }

        return database;
    }

}

