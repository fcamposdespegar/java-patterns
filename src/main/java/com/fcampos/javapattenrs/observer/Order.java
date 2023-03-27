package com.fcampos.javapattenrs.observer;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;

    private double itemCost;

    private int count;

    private List<OrderObserver> observers = new ArrayList<>();

    private double discount;

    private double shippingCost;

    public void attach(OrderObserver observer){
        observers.add(observer);
    }

    public void detach(OrderObserver observer){
        observers.remove(observer);
    }

    public Order(String id){
        this.id = id;
    }

    public double getTotal(){
        return itemCost - discount + shippingCost;
    }

    public void addItem(double price){
        this.itemCost += price;
        count++;
        observers.forEach( o -> o.update(this));
    }

    public int getCount(){
        return count;
    }

    public double getItemCost(){
        return itemCost;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(final double discount) {
        this.discount = discount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(final double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
