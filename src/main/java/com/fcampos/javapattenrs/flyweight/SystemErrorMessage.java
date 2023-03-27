package com.fcampos.javapattenrs.flyweight;

public class SystemErrorMessage implements ErrorMessage {

    //some error code with placeholder $errorCode
    private String messageTemplate;

    //URL with format: http://somedomain.com/help?error=
    private String helpUrlBase;

    public SystemErrorMessage(final String messageTemplate, final String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(final String code) {
        return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
    }
}
