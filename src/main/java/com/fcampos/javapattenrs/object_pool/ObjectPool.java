package com.fcampos.javapattenrs.object_pool;

import com.fcampos.javapattenrs.object_pool.product.Poolable;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private BlockingDeque<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        this.availablePool = new LinkedBlockingDeque<>();

        for (int i=0; i<count; i++) {
            availablePool.offer(creator.get());
        }
    }

    public T get(){
        try{
            return availablePool.take();
        } catch (InterruptedException ex){
            System.err.print("take() was interrupted.");
        }
        return null;
    }

    public void release(T obj){
        obj.reset();

        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.err.print("put() was interrupted.");
        }
    }
}
