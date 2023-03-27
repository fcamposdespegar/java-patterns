package com.fcampos.javapattenrs.interpreter;

public class Client {

    public static void main(String[] args){

        Report report = new Report("Cashflow report", "FINANCE_ADMIN OR ADMIN");

        ExpressionBuilder builder = new ExpressionBuilder();

        PermissionExpression expression = builder.build(report);

        User user1 = new User("David", "USER", "ADMIN");

        System.out.println("User acces report: " + expression.interpreter(user1));
    }
}
