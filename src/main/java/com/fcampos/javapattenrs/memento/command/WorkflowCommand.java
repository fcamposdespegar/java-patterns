package com.fcampos.javapattenrs.memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
