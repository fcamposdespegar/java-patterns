package com.fcampos.javapattenrs.memento.command;

import com.fcampos.javapattenrs.memento.WorkflowDesigner;

public class CreateCommand extends AbstractWorkflowCommand{

    private String name;

    public CreateCommand(WorkflowDesigner designer, String name){
        super(designer);
        this.name = name;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.createWorkflow(this.name);
    }
}
