package dev.realz.swords.essence;

import dev.realz.swords.Swords;
import net.minecraft.world.item.Item;

public class EssenceBase extends Item {

    public EssenceBase() {
        super(new Item.Properties().tab(Swords.ESSENCETAB));
    }
}
