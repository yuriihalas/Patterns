package com.epam.behavioral.command;

import com.epam.behavioral.command.invoker.RemoteControl;
import com.epam.behavioral.command.receiver.Laptop;
import com.epam.behavioral.command.specific.Command;
import com.epam.behavioral.command.specific.LogInCommand;
import com.epam.behavioral.command.specific.RunItellijIdeaCommand;
import com.epam.behavioral.command.specific.TurnOffCommand;
import com.epam.behavioral.command.specific.TurnOnCommand;

public class RunnerCommand {

    //Тут два випадки є, де можна передавати зразу всі команди в конструкторі або по одній сетати в invoker класі
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Laptop laptop = new Laptop();
        Command turnOnLaptop = new TurnOnCommand(laptop);
        Command turnOffLaptop = new TurnOffCommand(laptop);
        Command logInLaptop = new LogInCommand(laptop);
        Command runItellijIdea = new RunItellijIdeaCommand(laptop);

        control.setCommand(turnOnLaptop);
        control.runCommand();

        control.setCommand(logInLaptop);
        control.runCommand();

        control.setCommand(runItellijIdea);
        control.runCommand();

        control.setCommand(turnOffLaptop);
        control.runCommand();
    }
}
