package com.fcampos.javapattenrs.decorator;

import java.util.Base64;

public class Base64EncodeMessage implements Message{

    private Message msg;

    public Base64EncodeMessage(final Message msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return Base64.getEncoder().encodeToString(msg.getMessage().getBytes());
    }
}
