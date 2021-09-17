package com.company.EX22;

public interface Simple<E>{
    boolean add(E e);
    void removeAt(int index);
    void remove();
    E get(int index);
    int size();
    void set(int index, E e);
}
