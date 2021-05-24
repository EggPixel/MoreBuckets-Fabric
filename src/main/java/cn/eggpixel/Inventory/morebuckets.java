package cn.eggpixel.Inventory;

import cn.eggpixel.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class morebuckets extends ItemGroup {
    public morebuckets() {
        super(9,"m_buckets");
    }

    @Override
    public ItemStack createIcon() {
        return ItemRegistry.woodenBucket.getStackForRender();
    }
}
