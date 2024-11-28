package net.builderdog.ancient_aether.block.blocktype;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class AncientVaseBlock extends VaseBlock {
    private final ResourceLocation vaseLootTable;
    private final ResourceKey<LootTable> vaseLootTableKey;

    @SuppressWarnings("unused")
    private Vec3 position;

    public AncientVaseBlock(ResourceLocation vaseLootTable, Properties properties) {
        super(properties);
        this.vaseLootTable = vaseLootTable;
        vaseLootTableKey = ResourceKey.create(Registries.LOOT_TABLE, vaseLootTable);
    }

    public void playerDestroy(@NotNull Level level, @NotNull Player player, @NotNull BlockPos pos, @NotNull BlockState state, @Nullable BlockEntity blockEntity, @NotNull ItemStack tool) {
        super.playerDestroy(level, player, pos, state, blockEntity, tool);
        if (level instanceof ServerLevel serverLevel) {
            LootParams parameters = new LootParams.Builder(serverLevel).withParameter(LootContextParams.BLOCK_STATE, state).withParameter(LootContextParams.TOOL, player.getMainHandItem()).withParameter(LootContextParams.ORIGIN, position).withParameter(LootContextParams.THIS_ENTITY, player).create(LootContextParamSets.BLOCK);
            LootTable lootTable = serverLevel.getServer().reloadableRegistries().getLootTable(vaseLootTableKey);
            List<ItemStack> list = lootTable.getRandomItems(parameters);
            for (ItemStack itemstack : list) {
                spawnLoot(itemstack, pos, level);
            }
        }
    }

    public void spawnLoot(ItemStack itemStack, BlockPos pos, Level level) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        if (!(itemStack.isEmpty() && level.isClientSide)) {
            ItemEntity itementity = new ItemEntity(level, x, y + 0.5, z, itemStack);
            itementity.setDefaultPickUpDelay();
            level.addFreshEntity(itementity);
            spawnDustParticles(level, pos);
        }
    }

    public static void spawnDustParticles(Level level, BlockPos pos) {
        double x = (double)pos.getX() + (double)(level.getRandom().nextFloat() - level.getRandom().nextFloat()) * 0.125;
        double y = (double)pos.getY() + (double)(level.getRandom().nextFloat() - level.getRandom().nextFloat()) * 0.125;
        double z = (double)pos.getZ() + (double)(level.getRandom().nextFloat() - level.getRandom().nextFloat()) * 0.125;
        if (level instanceof ServerLevel serverLevel) {
            serverLevel.sendParticles(ParticleTypes.POOF, x, y, z, 3, 0.5, 0.75, 0.5, 0.0);
        }
    }
}