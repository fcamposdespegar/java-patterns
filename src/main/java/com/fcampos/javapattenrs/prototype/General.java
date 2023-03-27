package com.fcampos.javapattenrs.prototype;

public class General extends GameUnit {

    private String state = "idle";

    public void boostMorale(){
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return String.format("General %s @ %s", state, getPosition());
    }

    @Override
    protected GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals ar unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Clone no supported");
    }
}
