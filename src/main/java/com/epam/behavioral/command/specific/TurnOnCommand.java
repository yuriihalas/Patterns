package com.epam.behavioral.command.specific;

import com.epam.behavioral.command.receiver.Laptop;

public class TurnOnCommand implements Command {
    private Laptop laptop;

    public TurnOnCommand(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void execute() {
        laptop.turnOn();
    }
}
