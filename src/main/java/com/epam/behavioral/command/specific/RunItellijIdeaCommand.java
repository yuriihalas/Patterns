package com.epam.behavioral.command.specific;

import com.epam.behavioral.command.receiver.Laptop;

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
