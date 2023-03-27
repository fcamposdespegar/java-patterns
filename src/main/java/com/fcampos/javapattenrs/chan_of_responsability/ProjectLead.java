package com.fcampos.javapattenrs.chan_of_responsability;

public class ProjectLead extends Employee {

    public ProjectLead(final LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(final LeaveApplication application) {
        //type is sick leave & duration is less than or equals to 2 days
        if( application.getType() == LeaveApplication.Type.Sick
                && application.getNoOfDays() <= 2){
            application.approve(this.getApproverRole());
            return true;
        }

        return false;
    }
}
