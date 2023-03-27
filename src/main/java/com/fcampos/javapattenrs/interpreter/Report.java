package com.fcampos.javapattenrs.interpreter;

public class Report {

    private String name;

    //"NOT ADMIN", "FINANCES_USER AND ADMIN",
    private String permission;

    public Report(final String name, final String permission) {
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public String getPermission() {
        return permission;
    }
}
