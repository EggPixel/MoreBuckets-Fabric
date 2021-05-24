package cn.eggpixel.item;

import cn.eggpixel.Inventory.morebuckets;
import net.minecraft.item.Item;


public class WoodenWaterBucket extends Item {

    public WoodenWaterBucket() {
        super(new Item.Settings().maxCount(1).group(new morebuckets()));
    }
}
