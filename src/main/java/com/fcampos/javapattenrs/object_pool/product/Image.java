package com.fcampos.javapattenrs.object_pool.product;

public interface Image extends Poolable {

    void draw();

    String getLocation();

    void setLocation(String location);

}
