package com.epam.structural.flyweight.building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private static final Logger LOG = LogManager.getLogger(Building.class);
    private List<Block> blocks;

    public Building() {
        blocks = new ArrayList<>();
    }

    public void addBlock(int possX, int possY, String name, int size) {
        BlockType blockType = BlockFactory.getBlock(name, size);
        Block block = new Block(possX, possY, blockType);
        blocks.add(block);
    }

    public void showAllBlocks() {
        blocks.forEach(LOG::info);
    }
}
