package com.epam.behavioural.command.specific;

import com.epam.behavioural.command.receiver.Laptop;

public class RunItellijIdeaCommand implements Command {
    private Laptop laptop;

    public RunItellijIdeaCommand(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void execute() {
        laptop.runItellijIdea();
    }
}
