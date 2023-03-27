package com.fcampos.javapattenrs.command;

public class AddMemberCommand implements Command {

    public String emailAddress;

    public String listName;

    public EwsService receiver;

    public AddMemberCommand(final String emailAddress, final String listName, final EwsService receiver) {
        this.emailAddress = emailAddress;
        this.listName = listName;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.addMember(this.emailAddress, this.listName);
    }
}
