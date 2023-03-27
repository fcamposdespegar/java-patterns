package com.fcampos.javapattenrs.visitor;

import com.fcampos.javapattenrs.visitor.employee.Manager;
import com.fcampos.javapattenrs.visitor.employee.Programmer;
import com.fcampos.javapattenrs.visitor.employee.ProjectLead;
import com.fcampos.javapattenrs.visitor.employee.CEO;

public interface Visitor {

    void visit(Programmer programmer);

    void visit(ProjectLead projectLead);

    void visit(Manager manager);

    void visit(CEO ceo);
}
