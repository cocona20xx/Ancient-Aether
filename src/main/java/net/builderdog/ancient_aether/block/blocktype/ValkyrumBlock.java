package net.builderdog.ancient_aether.block.blocktype;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ValkyrumBlock extends Block {
    public ValkyrumBlock(Properties properties) {
        super(properties);
    }

    //TODO: change to check for the gravitite-equiv. tier tag? Need to see how other addons handle this...
    @SuppressWarnings("deprecation")
    @Override
    public boolean canHarvestBlock(@NotNull BlockState state, @NotNull BlockGetter getter, @NotNull BlockPos pos, Player player) {
        if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
            return tieredItem.getTier().getLevel() >= 5;
        return false;
    }
}