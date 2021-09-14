package com.company.EX8;

import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }


    /**
     * insert element in the end, if size < capacity
     * @param element element that should be inserted
     */
    @Override
    public void add(E element) {
        if(content.size()==capacity){
            throw new IndexOutOfBoundsException();
        }
        else {
            content.add(element);
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}' + content;
    }
}
