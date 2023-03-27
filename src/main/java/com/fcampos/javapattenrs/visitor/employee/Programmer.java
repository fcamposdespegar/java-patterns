package com.fcampos.javapattenrs.visitor.employee;

import com.fcampos.javapattenrs.visitor.Visitor;

public class Programmer extends AbstractEmployee {

    private String skill;

    public Programmer(final String name, final String skill) {
        super(name);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }


    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
