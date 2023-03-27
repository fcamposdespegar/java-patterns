package com.fcampos.javapattenrs.proxy.dynamic;

import com.fcampos.javapattenrs.proxy.Image;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImageInvocationHandler implements InvocationHandler {



    @Override
    public Object invoke(final Object o, final Method method, final Object[] args) throws Throwable {

        //setLocation logic method
        Method setLocationMethod = Image.class.getMethod("setLocation", new Class[]{String.class});
        if(setLocationMethod.equals(method)){
            String point = (String)args[0];
            System.out.println(point);
        }

        return null;
    }
}
