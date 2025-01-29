package com.turgaydede.structural.composite;

public class BankEmployee implements BankComponent {
    private String employeeId;
    private String name;
    private String position;

    public BankEmployee(String employeeId, String name, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Çalışan ID: " + employeeId + ", Adı: " + name + ", Pozisyon: " + position);
    }
}
