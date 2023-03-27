package com.fcampos.javapattenrs.prototype;

public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack(){
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return String.format("Swordsman %s @ %s", state, this.getPosition());
    }

    protected void reset() {
        this.state = "idle";
    }
}
