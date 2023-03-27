package com.fcampos.javapattenrs.factory_method.creator;

import com.fcampos.javapattenrs.factory_method.product.Message;
import com.fcampos.javapattenrs.factory_method.product.TextMessage;

public class TextMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
