package com.epam.structural.flyweight.building;

public class Block {
    private int possX;
    private int possY;
    /**
     * means of which blocks created building
     */
    private BlockType blockType;

    public Block(int possX, int possY, BlockType blockType) {
        this.possX = possX;
        this.possY = possY;
        this.blockType = blockType;
    }

    @Override
    public String toString() {
        return "Block{" +
            "possX=" + possX +
            ", possY=" + possY +
            ", blockType=" + blockType +
            '}';
    }
}
