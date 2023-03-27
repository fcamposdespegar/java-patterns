package com.fcampos.javapattenrs.state.states;

public class InTransit implements OrderState {
    @Override
    public double handleCancellation() {
        System.out.println("In-transit order need to contact parent gateway to rollback payment");
        System.out.println("Also need contacting to courier service for cancellation");
        return 20;
    }
}
