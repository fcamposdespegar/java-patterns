package com.fcampos.javapattenrs.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIMediator {

    private List<UIControl> colleagues = new ArrayList<>();

    public void register(UIControl control){
        this.colleagues.add(control);
    }

    public void valueChanged(UIControl control){
        colleagues.stream()
                .filter( c -> c != control)
                .forEach( c -> c.controlChanged(control));
    }
}
