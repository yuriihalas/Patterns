package com.epam.structural.adapter;

import com.epam.structural.adapter.vehicle.MachineAdapter;
import com.epam.structural.adapter.vehicle.machine.KiaMachine;
import com.epam.structural.adapter.vehicle.machine.Machine;

public class RunnerAdapter {
    public static void main(String[] args) {
        Machine machine = new KiaMachine();
        MachineAdapter machineAdapter = new MachineAdapter(machine);

        machine.drive();
        machineAdapter.ride();
    }
}
