package com.fcampos.javapattenrs.visitor.employee;

import com.fcampos.javapattenrs.visitor.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CEO extends AbstractEmployee {

    private List<Employee> directReports = new ArrayList<>();

    public CEO(final String name, Employee... employees) {
        super(name);
        Arrays.stream(employees).forEach(directReports::add);
    }

    @Override
    public Collection<Employee> getDirectReports() {
        return this.directReports;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
