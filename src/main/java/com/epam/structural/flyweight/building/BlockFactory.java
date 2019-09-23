package com.epam.structural.flyweight.building;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BlockFactory {
    private static Map<String, BlockType> blocks = new HashMap<>();

    public static BlockType getBlock(String name, int size) {
        BlockType blockType = blocks.get(name);
        if (Objects.isNull(blockType)) {
            blockType = new BlockType(name, size);
            blocks.put(name, blockType);
        }
        return blockType;
    }
}
