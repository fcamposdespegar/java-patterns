package com.fcampos.javapattenrs.command;

public class Client {

    public static void main (String[] args) throws InterruptedException {

        EwsService service = new EwsService();

        Command c1 = new AddMemberCommand("a@a.com", "spam", service);
        MailTasksRunner.getInstance().addCommand(c1);

        Command c2 = new AddMemberCommand("b@q.bom", "spam", service);
        MailTasksRunner.getInstance().addCommand(c2);

        Thread.sleep(3000);

        Command c3 = new AddMemberCommand("c@c.bom", "spam", service);
        MailTasksRunner.getInstance().addCommand(c3);

        Thread.sleep(1000);
        MailTasksRunner.getInstance().shutdown();
    }
}
