package net.builderdog.ancient_aether.data.resources.registries.placement;

import com.aetherteam.aether.AetherConfig;
import com.aetherteam.aether.data.resources.builders.AetherPlacedFeatureBuilders;
import com.aetherteam.aether.data.resources.registries.AetherConfiguredFeatures;
import com.aetherteam.aether.world.placementmodifier.ConfigFilter;
import com.aetherteam.aether.world.placementmodifier.ImprovedLayerPlacementModifier;
import net.builderdog.ancient_aether.data.resources.registries.features.AncientAetherVegetationFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.placement.*;

public class AncientAetherVegetationPlacements extends TrunkVineDecorator {
    public static final ResourceKey<PlacedFeature> AETHER_GRASS_PATCH = AncientAetherPlacementUtils.createKey("aether_grass_patch");
    public static final ResourceKey<PlacedFeature> WYNDCAPS_GRASS_PATCH = AncientAetherPlacementUtils.createKey("wyndcaps_grass_patch");
    public static final ResourceKey<PlacedFeature> SAKURA_JUNGLE_GRASS_PATCH = AncientAetherPlacementUtils.createKey("sakura_jungle_grass_patch");
    public static final ResourceKey<PlacedFeature> ELEVATED_ISLANDS_GRASS_PATCH = AncientAetherPlacementUtils.createKey("elevated_islands_grass_patch");
    public static final ResourceKey<PlacedFeature> BONUS_BERRY_BUSH_PATCH = AncientAetherPlacementUtils.createKey("bonus_berry_bush_patch");
    public static final ResourceKey<PlacedFeature> SKYROOT_MEADOW_FLOWERS = AncientAetherPlacementUtils.createKey("skyroot_meadow_flowers");
    public static final ResourceKey<PlacedFeature> SKYROOT_GROVE_FLOWERS = AncientAetherPlacementUtils.createKey("skyroot_grove_flowers");
    public static final ResourceKey<PlacedFeature> SKYROOT_FOREST_FLOWERS = AncientAetherPlacementUtils.createKey("skyroot_forest_flowers");
    public static final ResourceKey<PlacedFeature> SKYROOT_WOODLAND_FLOWERS = AncientAetherPlacementUtils.createKey("skyroot_woodland_flowers");
    public static final ResourceKey<PlacedFeature> SUN_FOREST_FLOWERS = AncientAetherPlacementUtils.createKey("sun_forest_flowers");
    public static final ResourceKey<PlacedFeature> WYNDCAPS_FLOWERS = AncientAetherPlacementUtils.createKey("wyndcaps_flowers");
    public static final ResourceKey<PlacedFeature> WYNDCAP_HIGHLAND_FLOWERS = AncientAetherPlacementUtils.createKey("wyndcap_highland_flowers");
    public static final ResourceKey<PlacedFeature> SKYROOT_JUNGLE_FLOWERS = AncientAetherPlacementUtils.createKey("skyroot_jungle_flowers");
    public static final ResourceKey<PlacedFeature> SAKURA_JUNGLE_FLOWERS = AncientAetherPlacementUtils.createKey("sakura_jungle_flowers");
    public static final ResourceKey<PlacedFeature> ELEVATED_ISLANDS_FLOWERS = AncientAetherPlacementUtils.createKey("elevated_islands_flowers");
    public static final ResourceKey<PlacedFeature> SKY_LAKE_FLOWERS = AncientAetherPlacementUtils.createKey("sky_lake_flowers");
    public static final ResourceKey<PlacedFeature> SKYROOT_MEADOW_TREES = AncientAetherPlacementUtils.createKey("skyroot_meadow_trees");
    public static final ResourceKey<PlacedFeature> SKYROOT_GROVE_TREES = AncientAetherPlacementUtils.createKey("skyroot_grove_trees");
    public static final ResourceKey<PlacedFeature> SKYROOT_FOREST_TREES = AncientAetherPlacementUtils.createKey("skyroot_forest_trees");
    public static final ResourceKey<PlacedFeature> SKYROOT_WOODLAND_TREES = AncientAetherPlacementUtils.createKey("skyroot_woodland_trees");
    public static final ResourceKey<PlacedFeature> SUN_FOREST_TREES = AncientAetherPlacementUtils.createKey("sun_forest_trees");
    public static final ResourceKey<PlacedFeature> WYNDCAP_TAIGA_TREES = AncientAetherPlacementUtils.createKey("wyndcap_taiga_trees");
    public static final ResourceKey<PlacedFeature> FESTIVE_WYNDCAP_TAIGA_TREES = AncientAetherPlacementUtils.createKey("festive_wyndcap_taiga_trees");
    public static final ResourceKey<PlacedFeature> WYNDCAP_HIGHLAND_TREES = AncientAetherPlacementUtils.createKey("wyndcap_highland_trees");
    public static final ResourceKey<PlacedFeature> SKYROOT_JUNGLE_TREES = AncientAetherPlacementUtils.createKey("skyroot_jungle_trees");
    public static final ResourceKey<PlacedFeature> SAKURA_JUNGLE_TREES = AncientAetherPlacementUtils.createKey("sakura_jungle_trees");
    public static final ResourceKey<PlacedFeature> ELEVATED_CLEARING_TREES = AncientAetherPlacementUtils.createKey("elevated_clearing_trees");
    public static final ResourceKey<PlacedFeature> ELEVATED_FOREST_TREES = AncientAetherPlacementUtils.createKey("elevated_forest_trees");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        AncientAetherPlacementUtils.register(context, AETHER_GRASS_PATCH, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.AETHER_GRASS_PATCH),
                NoiseThresholdCountPlacement.of(-0.8, 10, 20),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome(),
                new ConfigFilter(AetherConfig.SERVER.generate_tall_grass)
        );
        AncientAetherPlacementUtils.register(context, WYNDCAPS_GRASS_PATCH, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.FROZEN_AETHER_GRASS_PATCH),
                NoiseThresholdCountPlacement.of(-0.8, 10, 20),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome(),
                new ConfigFilter(AetherConfig.SERVER.generate_tall_grass)
        );
        AncientAetherPlacementUtils.register(context, SAKURA_JUNGLE_GRASS_PATCH, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.JUNGLE_AETHER_GRASS_PATCH),
                NoiseThresholdCountPlacement.of(-0.8, 15, 25),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome(),
                new ConfigFilter(AetherConfig.SERVER.generate_tall_grass)
        );
        AncientAetherPlacementUtils.register(context, ELEVATED_ISLANDS_GRASS_PATCH, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.PALE_AETHER_GRASS_PATCH),
                NoiseThresholdCountPlacement.of(-0.8, 10, 20),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome(),
                new ConfigFilter(AetherConfig.SERVER.generate_tall_grass)
        );

        AncientAetherPlacementUtils.register(context, SKYROOT_MEADOW_FLOWERS, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.AETHER_FLOWER_PATCH),
                CountPlacement.of(6),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome()
        );
        AncientAetherPlacementUtils.register(context, SKYROOT_GROVE_FLOWERS, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.AETHER_FLOWER_PATCH),
                CountPlacement.of(5),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome()
        );
        AncientAetherPlacementUtils.register(context, SKYROOT_FOREST_FLOWERS, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.SKYROOT_FOREST_FLOWER_PATCH),
                CountPlacement.of(2),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome()
        );
        AncientAetherPlacementUtils.register(context, SKYROOT_WOODLAND_FLOWERS, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.SKYROOT_FOREST_FLOWER_PATCH),
                CountPlacement.of(1),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome()
        );
        AncientAetherPlacementUtils.register(context, SUN_FOREST_FLOWERS, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.AETHER_FLOWER_PATCH),
                CountPlacement.of(2),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome()
        );
        AncientAetherPlacementUtils.register(context, WYNDCAPS_FLOWERS, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.WYNDCAPS_FLOWER_PATCH),
                CountPlacement.of(1),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome()
        );
        AncientAetherPlacementUtils.register(context, WYNDCAP_HIGHLAND_FLOWERS, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.WYNDCAPS_FLOWER_PATCH),
                CountPlacement.of(3),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome()
        );
        AncientAetherPlacementUtils.register(context, SKYROOT_JUNGLE_FLOWERS, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.SKYROOT_JUNGLE_FLOWER_PATCH),
                CountPlacement.of(2),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome()
        );
        AncientAetherPlacementUtils.register(context, SAKURA_JUNGLE_FLOWERS, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.SAKURA_JUNGLE_FLOWER_PATCH),
                CountPlacement.of(2),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome()
        );
        AncientAetherPlacementUtils.register(context, ELEVATED_ISLANDS_FLOWERS, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.ELEVATED_ISLANDS_FLOWER_PATCH),
                CountPlacement.of(1),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome()
        );
        AncientAetherPlacementUtils.register(context, SKY_LAKE_FLOWERS, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.SKY_LAKE_FLOWER_PATCH),
                CountPlacement.of(2),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome()
        );

        AncientAetherPlacementUtils.register(context, BONUS_BERRY_BUSH_PATCH, configuredFeatures.getOrThrow(AetherConfiguredFeatures.BERRY_BUSH_PATCH_CONFIGURATION),
                RarityFilter.onAverageOnceEvery(3),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome());

        AncientAetherPlacementUtils.register(context, SKYROOT_MEADOW_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_SKYROOT_MEADOW),
                AetherPlacedFeatureBuilders.treePlacement(RarityFilter.onAverageOnceEvery(3))
        );
        AncientAetherPlacementUtils.register(context, SKYROOT_GROVE_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_SKYROOT_GROVE),
                AetherPlacedFeatureBuilders.treePlacement(PlacementUtils.countExtra(5, 0.1F, 1))
        );
        AncientAetherPlacementUtils.register(context, SKYROOT_FOREST_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_SKYROOT_FOREST),
                AetherPlacedFeatureBuilders.treePlacement(PlacementUtils.countExtra(20, 0.1F, 1))
        );
        AncientAetherPlacementUtils.register(context, SKYROOT_WOODLAND_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_SKYROOT_WOODLAND),
                AetherPlacedFeatureBuilders.treePlacement(PlacementUtils.countExtra(24, 0.1F, 1))
        );
        AncientAetherPlacementUtils.register(context, SUN_FOREST_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_SUN_FOREST),
                AetherPlacedFeatureBuilders.treePlacement(PlacementUtils.countExtra(20, 0.1F, 1))
        );
        AncientAetherPlacementUtils.register(context, WYNDCAP_TAIGA_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_WYNDCAPS),
                AetherPlacedFeatureBuilders.treePlacement(PlacementUtils.countExtra(16, 0.1F, 1))
        );
        AncientAetherPlacementUtils.register(context, FESTIVE_WYNDCAP_TAIGA_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_FESTIVE_WYNDCAPS),
                AetherPlacedFeatureBuilders.treePlacement(PlacementUtils.countExtra(16, 0.1F, 1))
        );
        AncientAetherPlacementUtils.register(context, WYNDCAP_HIGHLAND_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_WYNDCAPS),
                AetherPlacedFeatureBuilders.treePlacement(RarityFilter.onAverageOnceEvery(3))
        );
        AncientAetherPlacementUtils.register(context, SKYROOT_JUNGLE_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_SKYROOT_JUNGLE),
                AetherPlacedFeatureBuilders.treePlacement(PlacementUtils.countExtra(28, 0.1F, 1))
        );
        AncientAetherPlacementUtils.register(context, SAKURA_JUNGLE_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_SAKURA),
                AetherPlacedFeatureBuilders.treePlacement(PlacementUtils.countExtra(28, 0.1F, 1))
        );
        AncientAetherPlacementUtils.register(context, ELEVATED_CLEARING_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_ELEVATED_ISLANDS),
                AetherPlacedFeatureBuilders.treePlacement(RarityFilter.onAverageOnceEvery(3))
        );
        AncientAetherPlacementUtils.register(context, ELEVATED_FOREST_TREES, configuredFeatures.getOrThrow(AncientAetherVegetationFeatures.TREES_ELEVATED_ISLANDS),
                AetherPlacedFeatureBuilders.treePlacement(PlacementUtils.countExtra(12, 0.1F, 1))
        );
    }
}