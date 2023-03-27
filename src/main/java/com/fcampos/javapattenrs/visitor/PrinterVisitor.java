package com.fcampos.javapattenrs.visitor;

import com.fcampos.javapattenrs.visitor.employee.Manager;
import com.fcampos.javapattenrs.visitor.employee.Programmer;
import com.fcampos.javapattenrs.visitor.employee.ProjectLead;
import com.fcampos.javapattenrs.visitor.employee.CEO;

public class PrinterVisitor implements Visitor{

    @Override
    public void visit(final Programmer programmer) {
        String msg = programmer.getName() + " is a " + programmer.getSkill() + " programmer.";
        System.out.println(msg);
    }

    @Override
    public void visit(final ProjectLead projectLead) {
        String msg = projectLead.getName() + " is a project lead with "+ projectLead.getDirectReports().size() + "programmers reporting.";
        System.out.println(msg);
    }

    @Override
    public void visit(final Manager manager) {
        String msg = manager.getName() + " is a manager with " + manager.getDirectReports().size() + " leads reporting";
        System.out.println(msg);
    }

    @Override
    public void visit(final CEO ceo) {
        String msg = ceo.getName() + " is a CEO with " + ceo.getDirectReports().size() + " managers reporting.";
        System.out.println(msg);
    }
}
