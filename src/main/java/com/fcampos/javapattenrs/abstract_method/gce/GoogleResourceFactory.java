package com.fcampos.javapattenrs.abstract_method.gce;

import com.fcampos.javapattenrs.abstract_method.Instance;
import com.fcampos.javapattenrs.abstract_method.ResourceFactory;
import com.fcampos.javapattenrs.abstract_method.Storage;

public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(final Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(final int capacityInMib) {
        return new GoogleCloudStorage(capacityInMib);
    }
}
