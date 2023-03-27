package com.fcampos.javapattenrs.template_method;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        Order order = new Order("1001");
        order.addItem("Sode", 2.50);
        order.addItem("Coca-cola", 3.75);
        order.addItem("Fernet", 5.45);

        OrderPrinter orderPrinter = new HtmlPrinter();
        orderPrinter.printerOrder(order, "1001.html");
    }
}
