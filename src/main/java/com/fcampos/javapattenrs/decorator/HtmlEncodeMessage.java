package com.fcampos.javapattenrs.decorator;

import org.apache.commons.text.StringEscapeUtils;

public class HtmlEncodeMessage implements Message{

    private Message msg;

    public HtmlEncodeMessage(final Message msg) {
        this.msg = msg;
    }


    @Override
    public String getMessage() {
        String message = msg.getMessage();
        return StringEscapeUtils.escapeHtml4(message);
    }
}
