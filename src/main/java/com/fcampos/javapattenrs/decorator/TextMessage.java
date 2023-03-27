package com.fcampos.javapattenrs.decorator;

public class TextMessage implements Message {

    private String msg;

    public TextMessage(final String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
