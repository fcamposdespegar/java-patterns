package com.fcampos.javapattenrs.chan_of_responsability;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args){

        LeaveApplication application = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now())
                .to(LocalDate.now().plusDays(10))
                .build();

        System.out.println(application);
        System.out.println("****************************************");
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(application);


    }

    public static LeaveApprover createChain(){

        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead lead = new ProjectLead(manager);

        return lead;
    }
}
