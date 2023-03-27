package com.fcampos.javapattenrs.adapter;

public class EmployeeObjectAdapter implements Customer{

    private Employee addapte;

    public EmployeeObjectAdapter(final Employee adaptee) {
        this.addapte = adaptee;
    }

    @Override
    public String getName() {
        return addapte.getFullName();
    }

    @Override
    public String getDesignation() {
        return addapte.getJobTitle();
    }

    @Override
    public String getAddress() {
        return addapte.getOfficeLocation();
    }
}
