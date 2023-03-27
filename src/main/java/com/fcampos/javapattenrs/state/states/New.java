package com.fcampos.javapattenrs.state.states;

public class New implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("A new order was cancelled without charge");
        return 0;
    }
}
