package com.fcampos.javapattenrs.factory_method.product;

public class JSONMessage extends Message{

    @Override
    public String getContent() {
        return "{\"JSON\": []}";
    }
}
