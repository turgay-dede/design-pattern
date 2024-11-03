package com.turgaydede.behavioral.state;

public interface AccountState {
    void deposit(double amount);
    void withdraw(double amount);
    void freezeAccount();
    void closeAccount();

    void openAccount();

}
