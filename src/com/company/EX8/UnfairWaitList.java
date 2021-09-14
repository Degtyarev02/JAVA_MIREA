package com.company.EX8;

import java.util.Collection;

public class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        content.remove(element);
    }

    @Override
    public String toString() {
        return "UnfairWaitList{" +
                "content=" + content +
                '}';
    }
}
