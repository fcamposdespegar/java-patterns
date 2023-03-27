package com.fcampos.javapattenrs.factory_method.creator;

import com.fcampos.javapattenrs.factory_method.product.JSONMessage;
import com.fcampos.javapattenrs.factory_method.product.Message;

public class JSONMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
