package com.fcampos.javapattenrs.state.states;

public class Delivered implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for item pick up");
        System.out.println("Payment roll back will be initialize upon receiving returned item");
        return 30;
    }
}
