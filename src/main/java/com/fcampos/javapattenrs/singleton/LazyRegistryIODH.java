package com.fcampos.javapattenrs.singleton;

// holder class ensures that, we hava a lazy instance without worrying about synchronization
public class LazyRegistryIODH {

    private LazyRegistryIODH(){
        System.out.println("In LazyRegistryIODH singleton");
    }

    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance(){
        return RegistryHolder.INSTANCE;
    }
}
