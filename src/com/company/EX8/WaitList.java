package com.company.EX8;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected Queue<E> content;


    /**
     Empty constructor
     */
    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }


    public WaitList(Collection<E> content) {
        this.content = new ConcurrentLinkedQueue<>(content);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    /**
     * Add element in the end of collection
     * @param element
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     * Remove and return element from end of queue
     * @return
     */
    @Override
    public E remove() {
        return content.poll();
    }


    /**
     *
     * @param element
     * @return Element if it is in the Queue
     */
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    /**
     *
     * @param c Queue
     * @return true if 1st Queue contains elements from 2nd Queue
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    /**
     *
     * @param element - element, that should be removed
     */
    @Override
    public void remove(E element) {
        content.remove(element);
    }
}
