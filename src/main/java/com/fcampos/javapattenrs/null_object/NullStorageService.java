package com.fcampos.javapattenrs.null_object;

public class NullStorageService extends StorageService {

    @Override
    public void save(final Report report) {
        System.out.println("Null object save method. Doing nothing");
    }
}
