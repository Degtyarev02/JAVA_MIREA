package com.company.EX8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UnfairWaitList<E> extends WaitList<E> {

    private Set<E> oldElements;

    public UnfairWaitList() {
        super();
        oldElements = new HashSet<>();
    }

    public void remove(E element) {

        content.remove(element);
        oldElements.add(element);
    }

    @Override
    public void add(E element) {
        if(!(oldElements.contains(element))) {
            content.add(element);
        } else {
            System.out.println("Нельзя вернуть удаленный");
        }
    }

    @Override
    public String toString() {
        return "UnfairWaitList{" +
                "content=" + content +
                '}';
    }
}
