package com.turgaydede.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class BankBranchFactory {
    private static final Map<String, BankBranchFlyweight> branches = new HashMap<>();

    public static BankBranchFlyweight getBranch(BranchType type, String location, String bankCode) {
        String key = type.name() + "_" + location + "_" + bankCode;
        if (!branches.containsKey(key)) {
            if (type == BranchType.PHYSICAL) {
                branches.put(key, new BankBranch(location, "Adres: " + location, bankCode));
                System.out.println("Yeni Fiziksel Şube Oluşturuldu: " + location);
            } else if (type == BranchType.ATM) {
                branches.put(key, new ATMBranch(location, bankCode));
                System.out.println("Yeni ATM Şubesi Oluşturuldu: " + location);
            }
        } else {
            System.out.println("Mevcut Şube Kullanıldı: " + location);
        }
        return branches.get(key);
    }
}


