package com.fcampos.javapattenrs.chan_of_responsability;

public abstract class Employee implements LeaveApprover {

    public String role;
    public LeaveApprover successor;

    public Employee(final String role, final LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(final LeaveApplication application) {
        if(!processRequest(application) && successor != null){
            successor.processLeaveApplication(application);
        }
    }

    protected abstract boolean processRequest(LeaveApplication application);

    @Override
    public String getApproverRole() {
        return role;
    }
}
