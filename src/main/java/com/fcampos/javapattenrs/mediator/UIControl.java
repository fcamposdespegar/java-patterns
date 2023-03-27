package com.fcampos.javapattenrs.mediator;

public interface UIControl {

    void controlChanged(UIControl control);

    String getControlValue();

    String getControlName();
}
