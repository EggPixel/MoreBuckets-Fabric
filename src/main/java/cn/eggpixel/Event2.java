package cn.eggpixel;

import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class Event2 implements AttackBlockCallback {
    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockPos pos, Direction direction) {
        if (player.getStackInHand(hand) == ItemRegistry.woodenWaterBucket.getStackForRender()) {
            player.setStackInHand(hand,ItemRegistry.woodenBucket.getStackForRender());
            world.setBlockState(pos, Blocks.WATER.getDefaultState());
        }
        return ActionResult.SUCCESS;
    }
}
