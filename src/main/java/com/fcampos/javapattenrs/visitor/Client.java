package com.fcampos.javapattenrs.visitor;

import com.fcampos.javapattenrs.visitor.employee.Employee;
import com.fcampos.javapattenrs.visitor.employee.Manager;
import com.fcampos.javapattenrs.visitor.employee.Programmer;
import com.fcampos.javapattenrs.visitor.employee.ProjectLead;
import com.fcampos.javapattenrs.visitor.employee.CEO;

public class Client {

    public static void main(String[] args){
        Employee emp = buildOrganization();
        AppraisalVisitor visitor = new AppraisalVisitor();

        visitOrganizationStructure(emp, visitor);

        visitor.getFinalRatings();

    }

    private static Employee buildOrganization(){

        Programmer p1 = new Programmer("Fernando", "C++");
        p1.setPerformanceRating(2);
        Programmer p2 = new Programmer("Martin R", "Java");
        p2.setPerformanceRating(3);

        Programmer p3 = new Programmer("Juan", "Java");
        p3.setPerformanceRating(4);
        Programmer p4 = new Programmer("Matias", "Angular");
        p3.setPerformanceRating(3);

        ProjectLead pl1 = new ProjectLead("Martin L", p1,p2);
        p3.setPerformanceRating(5);
        ProjectLead pl2 = new ProjectLead("Gabriel", p3, p4);
        p3.setPerformanceRating(4);

        Manager m1 = new Manager("Ignacio", pl1, pl2);
        p3.setPerformanceRating(3);

        CEO ceo = new CEO("Scoking", m1);
        p3.setPerformanceRating(5);

        return ceo;
    }

    private static void visitOrganizationStructure(Employee employee, Visitor visitor){
        employee.accept(visitor);

        for (Employee sub: employee.getDirectReports()){
            visitOrganizationStructure(sub, visitor);
        }
    }
}
