package com.fcampos.javapattenrs.bridge.refinedAbstraction;

import com.fcampos.javapattenrs.bridge.concrateImplementor.LinkedList;

public class Queue<T> implements FifoCollection<T>{

    private LinkedList<T> list;

    public Queue(final LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(final T element) {
        list.addLast(element);
    }

    @Override
    public T pool() {
        return list.removeFirst();
    }
}
