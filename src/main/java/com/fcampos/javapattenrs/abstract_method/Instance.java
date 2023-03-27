package com.fcampos.javapattenrs.abstract_method;

import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties;

public interface Instance {
    enum Capacity{micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
