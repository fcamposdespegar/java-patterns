package com.fcampos.javapattenrs.decorator;

public class Client {

    public static void main(String[] args){
        Message m = new TextMessage("The <FORCE> is strong from this one!");
        System.out.println(m.getMessage());

        Message htmlEncoder = new HtmlEncodeMessage(m);
        System.out.println(htmlEncoder.getMessage());

        Message base64Encoder = new Base64EncodeMessage(htmlEncoder);
        System.out.println(base64Encoder.getMessage());
    }
}
