package com.fcampos.javapattenrs.abstract_method.gce;

import com.fcampos.javapattenrs.abstract_method.Storage;

public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib) {
        System.out.println(String.format("Allocated %s on Google cloud Storage", capacityInMib));
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
}
