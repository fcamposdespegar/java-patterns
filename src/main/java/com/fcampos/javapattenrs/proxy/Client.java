package com.fcampos.javapattenrs.proxy;

public class Client {

    public static void main(String[] args){

        Image img = ImageFactory.getImage("img1.png");

        img.setLocation("10,10");
        System.out.println("Image Location: " + img.getLocation());
        System.out.println("rendering image now......");
        img.render();
    }
}
