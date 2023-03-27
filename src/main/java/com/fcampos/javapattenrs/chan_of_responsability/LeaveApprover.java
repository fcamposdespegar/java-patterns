package com.fcampos.javapattenrs.chan_of_responsability;

public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication application);

    String getApproverRole();
}
