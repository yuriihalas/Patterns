package com.epam.behavioural.command.specific;

import com.epam.behavioural.command.receiver.Laptop;

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
