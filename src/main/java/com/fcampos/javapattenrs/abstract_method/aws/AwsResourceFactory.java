package com.fcampos.javapattenrs.abstract_method.aws;

import com.fcampos.javapattenrs.abstract_method.Instance;
import com.fcampos.javapattenrs.abstract_method.ResourceFactory;
import com.fcampos.javapattenrs.abstract_method.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(final Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(final int capacityInMib) {
        return new S3Storage(capacityInMib);
    }
}
