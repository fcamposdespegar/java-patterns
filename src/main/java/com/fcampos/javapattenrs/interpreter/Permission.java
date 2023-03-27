package com.fcampos.javapattenrs.interpreter;

import java.util.Locale;

public class Permission implements PermissionExpression {

    private String permission;

    public Permission(final String permission) {
        this.permission = permission.toLowerCase();
    }

    @Override
    public boolean interpreter(final User user) {
        return user.getPermissions().contains(permission);
    }

    @Override
    public String toString(){
        return permission;
    }
}
