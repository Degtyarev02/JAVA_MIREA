package com.company.EX8;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {

    private Set<E> oldElements;

    public UnfairWaitList() {
        super();
        oldElements = new HashSet<>();
    }

    public void remove(E element) {
        if (content.peek().equals(element)) {
            Queue<E> tmp = new ConcurrentLinkedQueue<>();
            E tmp_element = content.poll();
            while(!content.isEmpty()){
                tmp.add(content.poll());
            }
            tmp.add(tmp_element);
            content = tmp;
            oldElements.add(element);
        } else {
            content.remove(element);
            oldElements.add(element);
        }
    }

    @Override
    public void add(E element) {
        if (!(oldElements.contains(element))) {
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
