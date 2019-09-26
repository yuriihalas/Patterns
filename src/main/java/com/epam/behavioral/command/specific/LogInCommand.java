package com.epam.behavioral.command.specific;

import com.epam.behavioral.command.receiver.Laptop;

public class LogInCommand implements Command {
    private Laptop laptop;

    public LogInCommand(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void execute() {
        laptop.logIn();
    }
}
