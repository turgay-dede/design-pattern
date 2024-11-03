package com.turgaydede.behavioral.visitor;

public interface Account {
    void accept(AccountVisitor visitor);
}
