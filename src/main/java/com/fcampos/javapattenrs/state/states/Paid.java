package com.fcampos.javapattenrs.state.states;

public class Paid implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Paid order need to contact parent gateway to rollback payment");
        return 10;
    }
}
