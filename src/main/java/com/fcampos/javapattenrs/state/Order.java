package com.fcampos.javapattenrs.state;

import com.fcampos.javapattenrs.state.states.Cancelled;
import com.fcampos.javapattenrs.state.states.Delivered;
import com.fcampos.javapattenrs.state.states.InTransit;
import com.fcampos.javapattenrs.state.states.New;
import com.fcampos.javapattenrs.state.states.OrderState;
import com.fcampos.javapattenrs.state.states.Paid;

public class Order {

    private OrderState currentState;

    public Order() {
        this.currentState = new New();
    }

    public double cancel(){
        double charges = currentState.handleCancellation();
        currentState = new Cancelled();
        return charges;
    }

    public void paymentSuccessfully(){
        currentState = new Paid();
    }

    public void dispatched(){
        currentState = new InTransit();
    }

    public void delivered(){
        currentState = new Delivered();
    }

}
