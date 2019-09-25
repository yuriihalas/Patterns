package com.epam.behavioural.command.specific;

import com.epam.behavioural.command.receiver.Laptop;

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
