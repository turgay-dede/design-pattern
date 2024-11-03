package com.turgaydede.creational.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("Turgay", "Dede")
                .age(26)
                .address("Giresun")
                .phoneNumber("5300000000")
                .build();
        System.out.println(user);
    }
}
