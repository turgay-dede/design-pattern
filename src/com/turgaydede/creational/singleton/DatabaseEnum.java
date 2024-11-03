package com.turgaydede.creational.singleton;

import java.io.Serializable;

public enum DatabaseEnum implements Serializable {
    SINGLETON;

    DatabaseEnum(){}

    public static DatabaseEnum getInstance(){
        return SINGLETON;
    }
}
