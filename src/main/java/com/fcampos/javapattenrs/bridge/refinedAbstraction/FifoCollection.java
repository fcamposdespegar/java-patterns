package com.fcampos.javapattenrs.bridge.refinedAbstraction;

public interface FifoCollection <T>{

    void offer(T element);

    T pool();
}
