package com.turgaydede.behavioral.mediator.bank;

import com.turgaydede.behavioral.mediator.bank.service.AccountAuthentication;

public class SimpleAccountAuthentication implements AccountAuthentication {
    @Override
    public boolean authenticate(String accountNumber) {
        System.out.println("Kimlik doğrulandı.");
        return true;
    }
}