package cn.eggpixel;

import cn.eggpixel.item.WoodenBucket;
import cn.eggpixel.item.WoodenWaterBucket;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ItemRegistry {
    public final static Item woodenBucket = new WoodenBucket();
    public final static Item woodenWaterBucket = new WoodenWaterBucket();
    public ItemRegistry() {
        Registry.register(Registry.ITEM,new Identifier(Untils.MOD_ID, "wooden_bucket"),woodenBucket);
        Registry.register(Registry.ITEM,new Identifier(Untils.MOD_ID, "water_wooden_bucket"),woodenWaterBucket);
    }
}
