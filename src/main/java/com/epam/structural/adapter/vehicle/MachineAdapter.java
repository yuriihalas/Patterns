package com.epam.structural.adapter.vehicle;

import com.epam.structural.adapter.vehicle.machine.Machine;
import com.epam.structural.adapter.vehicle.machine.ToyMotorcycle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MachineAdapter implements ToyMotorcycle {
    private Machine machine;

    public MachineAdapter(Machine machine) {
        //there also can be set new characters of machine
        this.machine = machine;
    }

    @Override
    public void ride() {
        machine.drive();
    }
}
