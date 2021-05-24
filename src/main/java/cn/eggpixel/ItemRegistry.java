package cn.eggpixel;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ItemRegistry {
    public final static Item woodenBucket = new WoodenBucket();
    public ItemRegistry() {
        Registry.register(Registry.ITEM,new Identifier(Untils.MOD_ID, "wooden_bucket"),woodenBucket);
    }
}
