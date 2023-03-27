package com.fcampos.javapattenrs.abstract_method.aws;

import com.fcampos.javapattenrs.abstract_method.Instance;
import com.fcampos.javapattenrs.abstract_method.Storage;

public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capacity) {
        System.out.println("Created Ec2Instance");
    }

    @Override
    public void start() {
        System.out.println("Ec2Instance started");
    }

    @Override
    public void attachStorage(final Storage storage) {
        System.out.println(String.format("Attached %s to Ec2Instance", storage));
    }

    @Override
    public void stop() {
        System.out.println("Ec2Instance stopped");
    }

    @Override
    public String toString() {
        return "Ec2Instance";
    }
}