package com.fcampos.javapattenrs.proxy;

public class ImageProxy implements Image {

    private BitmapImage image;
    private String name;
    private String location;

    public ImageProxy(final String filename) {
        this.name = filename;
    }

    @Override
    public void setLocation(final String location) {
        if(image != null){
            image.setLocation(location);
        } else {
            this.location = location;
        }
    }

    @Override
    public String getLocation() {
        if(image != null){
            return image.getLocation();
        }
        return this.location;
    }

    @Override
    public void render() {
        if(image == null){
            image = new BitmapImage(this.name);
            if(location != null) {
                image.setLocation(this.location);
            }
        }

        image.render();
    }
}
