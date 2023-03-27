package com.fcampos.javapattenrs.factory_method;

import com.fcampos.javapattenrs.factory_method.creator.JSONMessageCreator;
import com.fcampos.javapattenrs.factory_method.creator.MessageCreator;
import com.fcampos.javapattenrs.factory_method.creator.TextMessageCreator;
import com.fcampos.javapattenrs.factory_method.product.Message;

public class FactoryMethodClient {

    public static void main(String[] args){

        // Using creator to crete a product, choice of creator determines type of product created
        printMessage(new JSONMessageCreator());

        // Using another creator to create another product
        printMessage(new TextMessageCreator());

    }

    private static void printMessage(MessageCreator creator){
        Message msg = creator.getMessage();
        System.out.println(msg.getContent());
    }

}
