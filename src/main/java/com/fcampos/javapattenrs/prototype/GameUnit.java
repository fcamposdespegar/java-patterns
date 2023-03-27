package com.fcampos.javapattenrs.prototype;

public abstract class GameUnit implements Cloneable{

    private String position;

    public GameUnit() {
        position = "ZERO";
    }

    public GameUnit(float x, float y, float z) {
        this.position = "ALGO";
    }

    @Override
    protected GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    public void initialize() {
        this.position = "ZERO";
        reset();
    }

    protected abstract void reset();

    public void move(String direction, float distance){
        position = "CHANGE DIRECTION";
    }

    public String getPosition() {
        return position;
    }
}
