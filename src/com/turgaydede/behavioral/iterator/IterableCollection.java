package com.turgaydede.behavioral.iterator;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
