package com.epam.behavioral.command.specific;

import com.epam.behavioral.command.receiver.Laptop;

public class TurnOffCommand implements Command {
    private Laptop laptop;

    public TurnOffCommand(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void execute() {
        laptop.turnOff();
    }
}
