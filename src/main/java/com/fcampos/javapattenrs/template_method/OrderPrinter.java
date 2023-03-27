package com.fcampos.javapattenrs.template_method;

import java.io.IOException;
import java.io.PrintWriter;

public abstract class OrderPrinter {

    public final void printerOrder(Order order, String filename) throws IOException {
        try(PrintWriter writer = new PrintWriter(filename)){
            writer.println(this.start());

            writer.println(this.formatOrderNumber(order));
            writer.println(this.formatItems(order));
            writer.println(this.formatTotal(order));

            writer.println(this.end());
        }
    }

    protected abstract String start();

    protected abstract String formatOrderNumber(Order order);

    protected abstract String formatItems(Order order);

    protected abstract String formatTotal(Order order);

    protected abstract String end();
}
