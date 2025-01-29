package com.turgaydede.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BankBranch implements BankComponent {
    private String branchId;
    private String branchName;
    private List<BankComponent> components = new ArrayList<>();

    public BankBranch(String branchId, String branchName) {
        this.branchId = branchId;
        this.branchName = branchName;
    }

    public void addComponent(BankComponent component) {
        components.add(component);
    }

    public void removeComponent(BankComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Şube ID: " + branchId + ", Şube Adı: " + branchName);
        for (BankComponent component : components) {
            component.showDetails();
        }
    }
}
