package com.fcampos.javapattenrs.state.states;

public class Cancelled implements OrderState {

    @Override
    public double handleCancellation() {
        throw new IllegalStateException("Canceled order cannot be cancelled.");
    }
}
