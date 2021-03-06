package cn.eggpixel;

import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class Event implements AttackBlockCallback {
    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockPos pos, Direction direction) {
        if (world.getFluidState(pos).getFluid() == Fluids.WATER && player.getStackInHand(hand) == ItemRegistry.woodenBucket.getStackForRender()) {
            player.setStackInHand(hand,ItemRegistry.woodenWaterBucket.getStackForRender());
            world.setBlockState(pos, Blocks.AIR.getDefaultState());
        }
        return ActionResult.SUCCESS;
    }
}
