package com.fcampos.javapattenrs.memento.command;

import com.fcampos.javapattenrs.memento.WorkflowDesigner;

public class RemoveStepCommand extends AbstractWorkflowCommand {

    private String name;

    public RemoveStepCommand(final WorkflowDesigner receiver, final String name) {
        super(receiver);
        this.name = name;
    }

    @Override
    public void execute() {
        memento = receiver.getMemento();
        receiver.removeStep(this.name);
    }
}
