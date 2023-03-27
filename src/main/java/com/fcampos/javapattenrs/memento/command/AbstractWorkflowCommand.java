package com.fcampos.javapattenrs.memento.command;

import com.fcampos.javapattenrs.memento.WorkflowDesigner;

public abstract class AbstractWorkflowCommand implements WorkflowCommand {

    protected WorkflowDesigner.Memento memento;

    protected WorkflowDesigner receiver;

    public AbstractWorkflowCommand(final WorkflowDesigner receiver) {
        this.receiver = receiver;
    }

    @Override
    public void undo() {
        receiver.setMemento(memento);
    }
}
