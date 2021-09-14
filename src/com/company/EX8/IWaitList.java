package com.company.EX8;

import java.util.Collection;

/**
 * @author Degtyarev Vladimir
 * @param <E> generic
 */
public interface IWaitList <E>{
    void add(E element);

    /**
     *
     * @return First element in Queue
     */
    E remove();
    boolean contains(E element);
    boolean containsAll(Collection<E> c);
    boolean isEmpty();
    void remove(E element);

}
