package com.fcampos.javapattenrs.interpreter;

public class OrExpression implements PermissionExpression{

    private PermissionExpression expression1;

    private PermissionExpression expression2;

    public OrExpression(final PermissionExpression expression1, final PermissionExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpreter(final User user) {
        return this.expression1.interpreter(user) || this.expression2.interpreter(user);
    }

    @Override
    public String toString(){
        return expression1 + " OR " + expression2;
    }
}
