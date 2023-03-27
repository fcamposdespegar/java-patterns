package com.fcampos.javapattenrs.factory_method.creator;

import com.fcampos.javapattenrs.factory_method.product.Message;

public abstract class MessageCreator {

    public Message getMessage(){
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    public abstract Message createMessage();
}
