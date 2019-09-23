package com.epam.structural.flyweight;

import com.epam.structural.flyweight.building.Building;

public class RunnerFlyweight {
    private static final int COUNT_BLOCKS = 1_000_000;
    private static final int TYPES_BLOCKS = 2;

    public static void main(String[] args) {
        Building building = new Building();
        for (int i = 0; i < Math.floor(COUNT_BLOCKS / TYPES_BLOCKS); i++) {
            building.addBlock(random(0, 100), random(0, 100), "White", random(1, 10));
            building.addBlock(random(0, 200), random(0, 200), "Brown", random(1, 20));
        }
        building.showAllBlocks();
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
