package com.fcampos.javapattenrs.abstract_method.gce;

import com.fcampos.javapattenrs.abstract_method.Instance;
import com.fcampos.javapattenrs.abstract_method.Storage;

public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Create google compute engine instance");
    }

    @Override
    public void start() {
        System.out.println("Google compute engine started");
    }

    @Override
    public void attachStorage(final Storage storage) {
        System.out.println(String.format("Attached %s to google compute engine", storage));
    }

    @Override
    public void stop() {
        System.out.println("Google compute engine stopped");
    }

    @Override
    public String toString() {
        return "Google compute engine";
    }
}
