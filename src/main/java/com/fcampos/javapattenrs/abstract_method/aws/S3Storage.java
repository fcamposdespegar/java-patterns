package com.fcampos.javapattenrs.abstract_method.aws;

import com.fcampos.javapattenrs.abstract_method.Storage;

public class S3Storage implements Storage {

    public S3Storage(int capacityInMib) {
        System.out.println(String.format("Allocated %s on S3", capacityInMib));
    }

    @Override
    public String getId() {
        return "s31";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
