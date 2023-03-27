package com.fcampos.javapattenrs.bridge;

import com.fcampos.javapattenrs.bridge.concrateImplementor.SinglyLinkedList;
import com.fcampos.javapattenrs.bridge.refinedAbstraction.FifoCollection;
import com.fcampos.javapattenrs.bridge.refinedAbstraction.Queue;

public class Client {

    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());

        collection.offer(10);
        collection.offer(20);
        collection.offer(30);

        System.out.println(collection.pool());
        System.out.println(collection.pool());
        System.out.println(collection.pool());

        //null object return
        System.out.println(collection.pool());

    }
}
