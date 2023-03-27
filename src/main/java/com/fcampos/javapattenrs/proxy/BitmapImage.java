package com.fcampos.javapattenrs.proxy;

public class BitmapImage implements Image{
    private String name;
    private String location;


    public BitmapImage(final String name) {
        System.out.println("Loaded from disk: " + name);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println(String.format("Rendered %s", name));
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(final String location) {
        this.location = location;
    }
}
