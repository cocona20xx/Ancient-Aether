package net.builderdog.ancient_aether.data.resources.registries.features;

import com.aetherteam.aether.Aether;
import com.aetherteam.aether.data.resources.AetherFeatureStates;
import com.aetherteam.aether.data.resources.builders.AetherConfiguredFeatureBuilders;
import com.aetherteam.aether.world.feature.AetherFeatures;
import net.builderdog.ancient_aether.data.resources.AncientAetherFeatureStates;
import net.builderdog.ancient_aether.data.resources.builders.AncientAetherFeatureBuilders;
import net.builderdog.ancient_aether.world.feature.AncientAetherFeatures;
import net.builderdog.ancient_aether.world.feature.configuration.CloudbedConfiguration;
import net.builderdog.ancient_aether.world.feature.configuration.CrystalIslandConfiguration;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class AncientAetherMiscFeatures extends AncientAetherFeatureBuilders {
    public static final ResourceKey<ConfiguredFeature<?, ?>> COAST_QUICKSOIL = AncientAetherFeatureUtils.registerKey("coast_quicksoil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COAST_GRAVITY_GRAVEL = AncientAetherFeatureUtils.registerKey("coast_gravity_gravel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COAST_WYND_ICE = AncientAetherFeatureUtils.registerKey("coast_wynd_ice");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SKYROOT_LEAF_VINE = AncientAetherFeatureUtils.registerKey("skyroot_leaf_vine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SHORT_SKYROOT_LEAF_VINE = AncientAetherFeatureUtils.registerKey("short_skyroot_leaf_vine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VIOLET_AERCLOUD = AncientAetherFeatureUtils.registerKey("violet_aercloud");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CLOUDBED = AncientAetherFeatureUtils.registerKey("cloudbed");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRYSTAL_ISLAND_FROZEN = AncientAetherFeatureUtils.registerKey("crystal_island_frozen");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRYSTAL_ISLAND_PALE = AncientAetherFeatureUtils.registerKey("crystal_island_pale");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRONZE_DUNGEON_ENTRANCE = AncientAetherFeatureUtils.registerKey("bronze_dungeon_entrance");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        AncientAetherFeatureUtils.register(context, COAST_QUICKSOIL, AncientAetherFeatures.COAST.get(), createCoast(AetherFeatureStates.QUICKSOIL, 96, 128));
        AncientAetherFeatureUtils.register(context, COAST_GRAVITY_GRAVEL, AncientAetherFeatures.COAST.get(), createCoast(AncientAetherFeatureStates.GRAVITY_GRAVEL, 112, 144));
        AncientAetherFeatureUtils.register(context, COAST_WYND_ICE, AncientAetherFeatures.COAST.get(), createCoast(AncientAetherFeatureStates.WYND_ICE, 96, 128));
        AncientAetherFeatureUtils.register(context, SKYROOT_LEAF_VINE, Feature.BLOCK_COLUMN, createSkyrootLeafVine(12));
        AncientAetherFeatureUtils.register(context, SHORT_SKYROOT_LEAF_VINE, Feature.BLOCK_COLUMN, createSkyrootLeafVine(4));
        AncientAetherFeatureUtils.register(context, VIOLET_AERCLOUD, AetherFeatures.AERCLOUD.get(), AetherConfiguredFeatureBuilders.aercloud(8, AncientAetherFeatureStates.VIOLET_AERCLOUD));
        AncientAetherFeatureUtils.register(context, CLOUDBED, AncientAetherFeatures.CLOUDBED.get(), new CloudbedConfiguration(BlockStateProvider.simple(AetherFeatureStates.COLD_AERCLOUD), 80, 1.0D, 64L, 96L, 6.0F, 6.0F));
        AncientAetherFeatureUtils.register(context, CRYSTAL_ISLAND_FROZEN, AncientAetherFeatures.CONFIGURABLE_CRYSTAL_ISLAND.get(), new CrystalIslandConfiguration(ResourceLocation.fromNamespaceAndPath(Aether.MODID, "crystal_tree"), AncientAetherFeatureStates.FROZEN_AETHER_GRASS_BLOCK, AetherFeatureStates.HOLYSTONE));
        AncientAetherFeatureUtils.register(context, CRYSTAL_ISLAND_PALE, AncientAetherFeatures.CONFIGURABLE_CRYSTAL_ISLAND.get(), new CrystalIslandConfiguration(ResourceLocation.fromNamespaceAndPath(Aether.MODID, "crystal_tree"), AncientAetherFeatureStates.PALE_AETHER_GRASS_BLOCK, AetherFeatureStates.HOLYSTONE));
        AncientAetherFeatureUtils.register(context, BRONZE_DUNGEON_ENTRANCE, AncientAetherFeatures.DUNGEON_ENTRANCE.get());
    }
}