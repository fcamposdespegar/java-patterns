package com.fcampos.javapattenrs.strategy;


import java.util.LinkedList;

public class PrintService {

    private OrderPrinter printer;

    public PrintService(OrderPrinter printer) {
        this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders){
        this.printer.print(orders);
    }
}
