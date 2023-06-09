package com.fcampos.javapattenrs.object_pool;

import com.fcampos.javapattenrs.object_pool.product.Bitmap;

public class Client {

    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

    public static void main(String[] args){

        Bitmap b1 = bitmapPool.get();
        b1.setLocation("10,10");
        Bitmap b2 = bitmapPool.get();
        b2.setLocation("-10,0");

        b1.draw();
        b2.draw();

        bitmapPool.release(b1);
        bitmapPool.release(b2);


    }
}
