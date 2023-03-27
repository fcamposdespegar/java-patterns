package com.fcampos.javapattenrs.factory_method.product;

public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders(){
        //add some defaults headers
    }

    public void encrypt(){
        // add here some code to encrypt message
    }
}
