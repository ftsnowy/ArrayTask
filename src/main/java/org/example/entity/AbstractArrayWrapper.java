package org.example.entity;

public abstract class AbstractArrayWrapper {

    public abstract int length();

    public boolean isEmpty() {
        return length() == 0;
    }
}
