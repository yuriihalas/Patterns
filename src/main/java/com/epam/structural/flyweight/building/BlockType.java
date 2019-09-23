package com.epam.structural.flyweight.building;

public class BlockType {
    private String color;
    private int size;

    public BlockType(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "BlockType{" +
            "color='" + color + '\'' +
            ", size=" + size +
            '}';
    }
}
