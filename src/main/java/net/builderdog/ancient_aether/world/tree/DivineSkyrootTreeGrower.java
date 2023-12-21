package net.builderdog.ancient_aether.world.tree;

import net.builderdog.ancient_aether.datagen.generators.AncientAetherConfiguredFeatureData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class DivineSkyrootTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean largeHive) {
        if (random.nextInt(10) == 0) {
            return AncientAetherConfiguredFeatureData.FANCY_DIVINE_SKYROOT;
        } else {
            return AncientAetherConfiguredFeatureData.DIVINE_SKYROOT_TREE;
        }
    }
}
