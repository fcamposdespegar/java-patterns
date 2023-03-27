package com.fcampos.javapattenrs.state;

public class Client {

    public static void main(String[] args){

        Order order = new Order();

        order.paymentSuccessfully();
        order.cancel();



    }
}
