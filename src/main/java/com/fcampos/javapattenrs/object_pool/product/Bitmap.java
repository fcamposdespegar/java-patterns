package com.fcampos.javapattenrs.object_pool.product;

public class Bitmap implements Image {

    private String name;
    private String location;


    public Bitmap(final String name) {
        this.name = name;
    }


    @Override
    public void draw() {
        System.out.println(String.format("Drawing %s", name));
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(final String location) {
        this.location = location;
    }

    @Override
    public void reset() {
        this.location = null;
        System.out.println("Bitmap is reset");
    }
}
