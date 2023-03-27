package com.fcampos.javapattenrs.template_method;


import java.util.Collection;
import java.util.Map;

public class TextPrinter extends OrderPrinter {


    @Override
    protected String start() {
        return "Order Details";
    }

    @Override
    protected String formatOrderNumber(final Order order) {
        return String.format("Order #%s", order.getId());
    }

    @Override
    protected String formatItems(final Order order) {
        StringBuilder builder = new StringBuilder("Items \n-------------------------------------------- \n");

        for (Map.Entry<String, Double> entry : order.getItems().entrySet()){
            builder.append(entry.getKey() + " $" + entry.getValue() + "\n");
        }

        builder.append("------------------------------");
        return builder.toString();
    }

    @Override
    protected String formatTotal(final Order order) {
        return String.format("Total: $%s", order.getTotal());
    }

    @Override
    protected String end() {
        return "";
    }
}
