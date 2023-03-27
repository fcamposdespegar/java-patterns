package com.fcampos.javapattenrs.memento.command;

import com.fcampos.javapattenrs.memento.WorkflowDesigner;

public class AddStepCommand extends AbstractWorkflowCommand {

    private String step;

    public AddStepCommand(final WorkflowDesigner receiver, final String step) {
        super(receiver);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.addStep(this.step);
    }
}
