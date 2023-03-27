package com.fcampos.javapattenrs.command;

public class EwsService {

    public void addMember(String contact, String contactGroup){
        //contact exchange
        System.out.println(String.format("Added %s to %s", contact, contactGroup));
    }

    public void removeMember(String contact, String contactGroup){
        //contact exchange
        System.out.println(String.format("Removed %s from %s", contact, contactGroup));
    }
}
