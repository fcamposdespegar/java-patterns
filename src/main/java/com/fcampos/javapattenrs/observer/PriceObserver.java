package com.fcampos.javapattenrs.observer;

public class PriceObserver implements OrderObserver {

    @Override
    public void update(final Order order) {
        double total = order.getItemCost();

        if (total >= 500){
            order.setDiscount(20);
        }

        if(total >= 200){
            order.setDiscount(10);
        }
    }
}
