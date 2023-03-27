package com.fcampos.javapattenrs.proxy.dynamic;

import com.fcampos.javapattenrs.proxy.Image;

public class Client {

    public static void main(String[] args){
        Image img = ImageFactory.GetImage();
        img.setLocation("10,10");
    }
}
