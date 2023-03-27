package com.fcampos.javapattenrs.abstract_method;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capacityInMib);
}
