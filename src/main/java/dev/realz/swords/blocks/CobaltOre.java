package dev.realz.swords.blocks;

import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class CobaltOre extends OreBlock {

    public CobaltOre() {
        super(Properties.of(Material.METAL)
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops());
    }
}
