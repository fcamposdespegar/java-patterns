package com.fcampos.javapattenrs.interpreter;

public class NotExpression implements PermissionExpression {

    private PermissionExpression expression;

    public NotExpression(final PermissionExpression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpreter(final User user) {
        return !this.expression.interpreter(user);
    }

    @Override
    public String toString(){
        return "NOT " + expression;
    }
}
