package com.fcampos.javapattenrs.proxy.dynamic;

import com.fcampos.javapattenrs.proxy.Image;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ImageFactory {

    public static Image GetImage(){
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[]{Image.class}, new ImageInvocationHandler());
    }
}
