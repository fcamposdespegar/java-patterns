package com.fcampos.javapattenrs.singleton;

public class Client {

    public static void main(String[] args){
        //------- EAGER SINGLETON -----------//
        //here cannot use new EagerRegistry();
        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();
        //System.out.println(registry == registry1); //check if object is same

        //------- LAZY SINGLETON -----------//
        LazyRegistry lazySingleton = LazyRegistry.getInstance();
        LazyRegistry lazySingleton2 = LazyRegistry.getInstance();
        //System.out.println(registry == registry1); //check if object is same

        //------- HOLDER SINGLETON -----------//
        LazyRegistryIODH singleton;
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
        //Run this code only print output of constructor once

    }
}
