package com.company.EX22;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class SimpleArray<E> implements Simple<E> {
    private E[] values;

    public SimpleArray() {
        this.values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E o) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length+1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length-1] = o;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void removeAt(int index) {
        checkIndex(index);
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length-1];
            System.arraycopy(temp, 0, values, 0, index);
            System.arraycopy(temp, index+1, values, index, temp.length-index-1);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void remove() {
        this.removeAt(values.length-1);
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void set(int index, E e) {
        checkIndex(index);
        values[index] = e;
    }

    @Override
    public void sort() {
        Arrays.sort(values);
    }

    public void checkIndex(int index) {
        if(index < 0 || index >= values.length) throw new IndexOutOfBoundsException("Некорректный индекс");
    }

    public void clear() {
        this.values = (E[]) new Object[0];
    }


    @Override
    public String toString() {
        return Arrays.toString(values);
    }

}
