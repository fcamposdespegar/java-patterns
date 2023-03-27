package com.fcampos.javapattenrs.abstract_method;

import com.fcampos.javapattenrs.abstract_method.aws.AwsResourceFactory;
import com.fcampos.javapattenrs.abstract_method.gce.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(final ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib){
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args){
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();

        System.out.println("******************************************");

        Client gce = new Client(new GoogleResourceFactory());
        Instance i2 = gce.createServer(Instance.Capacity.large, 20480);
        i2.start();
        i2.stop();

    }
}
