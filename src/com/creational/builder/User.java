package com.creational.builder;

public class User {
    private String name;
    private String surname;

    private int age;
    private String phoneNumber;
    private String address;

    public User(Builder builder) {
        this.name =builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private String surname;

        private int age;
        private String phoneNumber;
        private String address;

        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
