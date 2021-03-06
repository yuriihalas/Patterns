package com.epam.behavioral.command.invoker;

import com.epam.behavioral.command.specific.Command;

import java.util.Objects;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand() {
        if (Objects.nonNull(command)) {
            command.execute();
        }
    }
}
