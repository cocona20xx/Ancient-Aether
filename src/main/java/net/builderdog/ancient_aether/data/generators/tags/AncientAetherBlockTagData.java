package net.builderdog.ancient_aether.data.generators.tags;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import net.builderdog.ancient_aether.AncientAether;
import net.builderdog.ancient_aether.AncientAetherTags;
import net.builderdog.ancient_aether.block.AncientAetherBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class AncientAetherBlockTagData extends BlockTagsProvider {
    public AncientAetherBlockTagData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper fileHelper) {
        super(output, registries, AncientAether.MODID, fileHelper);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addTags(HolderLookup.@NotNull Provider provider) {
        tag(AncientAetherTags.Blocks.HIGHSPROOT_LOGS).add(
                AncientAetherBlocks.HIGHSPROOT_LOG.get(),
                AncientAetherBlocks.HIGHSPROOT_WOOD.get(),
                AncientAetherBlocks.STRIPPED_HIGHSPROOT_LOG.get(),
                AncientAetherBlocks.STRIPPED_HIGHSPROOT_WOOD.get(),
                AncientAetherBlocks.HIGHSPROOT_LOG_WALL.get(),
                AncientAetherBlocks.HIGHSPROOT_WOOD_WALL.get(),
                AncientAetherBlocks.STRIPPED_HIGHSPROOT_LOG_WALL.get(),
                AncientAetherBlocks.STRIPPED_HIGHSPROOT_WOOD_WALL.get()
        );
        tag(AncientAetherTags.Blocks.SAKURA_LOGS).add(
                AncientAetherBlocks.SAKURA_LOG.get(),
                AncientAetherBlocks.SAKURA_WOOD.get(),
                AncientAetherBlocks.STRIPPED_SAKURA_LOG.get(),
                AncientAetherBlocks.STRIPPED_SAKURA_WOOD.get(),
                AncientAetherBlocks.SAKURA_LOG_WALL.get(),
                AncientAetherBlocks.SAKURA_WOOD_WALL.get(),
                AncientAetherBlocks.STRIPPED_SAKURA_LOG_WALL.get(),
                AncientAetherBlocks.STRIPPED_SAKURA_WOOD_WALL.get()
        );
        tag(AncientAetherTags.Blocks.VALKYRIE_BLOCKS).add(
                AncientAetherBlocks.VALKYRIE_BRICKS.get(),
                AncientAetherBlocks.VALKYRIE_BRICK_STAIRS.get(),
                AncientAetherBlocks.VALKYRIE_BRICK_SLAB.get(),
                AncientAetherBlocks.VALKYRIE_BRICK_WALL.get(),
                AncientAetherBlocks.VALKYRIE_TILES.get(),
                AncientAetherBlocks.VALKYRIE_TILE_STAIRS.get(),
                AncientAetherBlocks.VALKYRIE_TILE_SLAB.get(),
                AncientAetherBlocks.VALKYRIE_TILE_WALL.get(),
                AetherBlocks.PILLAR.get(),
                AetherBlocks.PILLAR_TOP.get()
        );
        tag(AncientAetherTags.Blocks.MOSAIC_BLOCKS).add(
                AncientAetherBlocks.HOLYSTONE_BRICK_MOSAIC.get(),
                AncientAetherBlocks.CARVED_STONE_MOSAIC.get(),
                AncientAetherBlocks.ANGELIC_STONE_MOSAIC.get(),
                AncientAetherBlocks.HELLFIRE_STONE_MOSAIC.get(),
                AncientAetherBlocks.AEROGETIC_STONE.get(),
                AncientAetherBlocks.GALE_STONE_MOSAIC.get(),
                AncientAetherBlocks.LOCKED_CARVED_STONE_MOSAIC.get(),
                AncientAetherBlocks.LOCKED_ANGELIC_STONE_MOSAIC.get(),
                AncientAetherBlocks.LOCKED_HELLFIRE_STONE_MOSAIC.get(),
                AncientAetherBlocks.LOCKED_AEROGETIC_STONE.get(),
                AncientAetherBlocks.LOCKED_GALE_STONE_MOSAIC.get()
        );
        tag(AncientAetherTags.Blocks.AEROGETIC_BLOCKS).add(
                AncientAetherBlocks.AEROGETIC_STONE.get(),
                AncientAetherBlocks.AEROGETIC_STAIRS.get(),
                AncientAetherBlocks.AEROGETIC_SLAB.get(),
                AncientAetherBlocks.AEROGETIC_WALL.get(),
                AncientAetherBlocks.AERONAUTIC_STONE.get(),
                AncientAetherBlocks.CORRUPTED_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.LOCKED_AEROGETIC_STONE.get(),
                AncientAetherBlocks.LOCKED_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.LOCKED_CORRUPTED_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.TRAPPED_AEROGETIC_STONE.get(),
                AncientAetherBlocks.TRAPPED_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.TRAPPED_CORRUPTED_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.BOSS_DOORWAY_AEROGETIC_STONE.get(),
                AncientAetherBlocks.BOSS_DOORWAY_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.BOSS_DOORWAY_CORRUPTED_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.TREASURE_DOORWAY_AEROGETIC_STONE.get(),
                AncientAetherBlocks.TREASURE_DOORWAY_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.TREASURE_DOORWAY_CORRUPTED_AERONAUTIC_STONE.get()
        );
        tag(AncientAetherTags.Blocks.VASES).add(
                AncientAetherBlocks.HOLYSTONE_VASE.get(),
                AncientAetherBlocks.MOSSY_HOLYSTONE_VASE.get(),
                AncientAetherBlocks.FROZEN_HOLYSTONE_VASE.get(),
                AncientAetherBlocks.SENTRY_VASE.get(),
                AncientAetherBlocks.ANGELIC_VASE.get(),
                AncientAetherBlocks.HELLFIRE_VASE.get(),
                AncientAetherBlocks.AEROGETIC_VASE.get(),
                AncientAetherBlocks.GALE_VASE.get(),
                AncientAetherBlocks.ANCIENT_HOLYSTONE_VASE.get(),
                AncientAetherBlocks.ANCIENT_MOSSY_HOLYSTONE_VASE.get(),
                AncientAetherBlocks.ANCIENT_FROZEN_HOLYSTONE_VASE.get(),
                AncientAetherBlocks.ANCIENT_SENTRY_VASE.get(),
                AncientAetherBlocks.ANCIENT_ANGELIC_VASE.get(),
                AncientAetherBlocks.ANCIENT_HELLFIRE_VASE.get(),
                AncientAetherBlocks.ANCIENT_AEROGETIC_VASE.get(),
                AncientAetherBlocks.ANCIENT_GALE_VASE.get()
        );
        tag(AncientAetherTags.Blocks.WYNDCAPS_ANIMAL_SPAWNABLE_ON).add(
                AetherBlocks.AETHER_GRASS_BLOCK.get(),
                Blocks.SNOW_BLOCK
        );
        tag(AncientAetherTags.Blocks.SLAMMROOT_SPAWNABLE_BLACKLIST).addTags(
                AncientAetherTags.Blocks.AEROGETIC_BLOCKS
        );
        tag(AncientAetherTags.Blocks.LEAF_VINE_CAN_SPAWN_ON).add(
                AetherBlocks.ICESTONE.get()
        ).addTags(
                //AetherTags.Blocks.HOLYSTONE,
                AetherTags.Blocks.SENTRY_BLOCKS,
                Tags.Blocks.ORES
        );
        tag(AncientAetherTags.Blocks.AETHER_CARVER_REPLACEABLES).add(
                Blocks.SNOW_BLOCK,
                Blocks.POWDER_SNOW
        ).addTags(
                AetherTags.Blocks.AETHER_ISLAND_BLOCKS
        );
        tag(AncientAetherTags.Blocks.REPLACEABLE_DUNGEON_BLOCKS).add(
                AetherBlocks.PRESENT.get(),
                Blocks.AIR,
                Blocks.WATER
        ).addTags(
                AncientAetherTags.Blocks.VASES,
                BlockTags.MINEABLE_WITH_SHOVEL,
                BlockTags.MINEABLE_WITH_PICKAXE,
                BlockTags.MINEABLE_WITH_AXE,
                BlockTags.MINEABLE_WITH_HOE,
                BlockTags.SWORD_EFFICIENT
        );
        tag(AncientAetherTags.Blocks.REPLACEABLE_BOSS_ROOM_BLOCKS).add(
                AncientAetherBlocks.CARVED_TILE_STAIRS.get()
        ).addTags(
                AetherTags.Blocks.DUNGEON_BLOCKS
        );

        tag(AetherTags.Blocks.AETHER_PORTAL_BLACKLIST).add(
                AncientAetherBlocks.VIOLET_AERCLOUD.get(),
                AncientAetherBlocks.ANCIENT_OBELISK.get(),
                AetherBlocks.AETHER_DIRT.get(),
                AetherBlocks.ICESTONE.get(),
                AetherBlocks.AEROGEL.get(),
                AetherBlocks.SKYROOT_PLANKS.get(),
                AetherBlocks.SKYROOT_STAIRS.get(),
                AetherBlocks.SKYROOT_SLAB.get(),
                AetherBlocks.SKYROOT_FENCE.get(),
                AetherBlocks.SKYROOT_BOOKSHELF.get()
        ).addTags(
                AncientAetherTags.Blocks.AEROGETIC_BLOCKS,
                AncientAetherTags.Blocks.VASES,
                AetherTags.Blocks.HOLYSTONE,
                AetherTags.Blocks.SENTRY_BLOCKS,
                AetherTags.Blocks.ANGELIC_BLOCKS,
                AetherTags.Blocks.HELLFIRE_BLOCKS,
                Tags.Blocks.ORES
        );
        tag(AetherTags.Blocks.AETHER_ISLAND_BLOCKS).add(
                AncientAetherBlocks.GRAVITY_GRAVEL.get(),
                AncientAetherBlocks.WYND_ICE.get()
        );
        tag(AetherTags.Blocks.AERCLOUDS).add(
                AncientAetherBlocks.VIOLET_AERCLOUD.get()
        );
        tag(AetherTags.Blocks.LOCKED_DUNGEON_BLOCKS).add(
                AncientAetherBlocks.LOCKED_CARVED_TILES.get(),
                AncientAetherBlocks.LOCKED_WYND_SENTRY_STONE.get(),
                AncientAetherBlocks.LOCKED_AEROGETIC_STONE.get(),
                AncientAetherBlocks.LOCKED_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.LOCKED_CORRUPTED_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.LOCKED_AEROGEL.get()
        );
        tag(AetherTags.Blocks.TRAPPED_DUNGEON_BLOCKS).add(
                AncientAetherBlocks.TRAPPED_CARVED_TILES.get(),
                AncientAetherBlocks.TRAPPED_AEROGETIC_STONE.get(),
                AncientAetherBlocks.TRAPPED_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.TRAPPED_CORRUPTED_AERONAUTIC_STONE.get()
        );
        tag(AetherTags.Blocks.BOSS_DOORWAY_DUNGEON_BLOCKS).add(
                AncientAetherBlocks.BOSS_DOORWAY_WYND_SENTRY_STONE.get(),
                AncientAetherBlocks.BOSS_DOORWAY_AEROGETIC_STONE.get(),
                AncientAetherBlocks.BOSS_DOORWAY_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.BOSS_DOORWAY_CORRUPTED_AERONAUTIC_STONE.get()
        );
        tag(AetherTags.Blocks.TREASURE_DOORWAY_DUNGEON_BLOCKS).add(
                AncientAetherBlocks.TREASURE_DOORWAY_WYND_SENTRY_STONE.get(),
                AncientAetherBlocks.TREASURE_DOORWAY_AEROGETIC_STONE.get(),
                AncientAetherBlocks.TREASURE_DOORWAY_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.TREASURE_DOORWAY_CORRUPTED_AERONAUTIC_STONE.get()
        );
        tag(AetherTags.Blocks.DUNGEON_BLOCKS).add(
                AncientAetherBlocks.CARVED_TILES.get(),
                AncientAetherBlocks.WYND_SENTRY_STONE.get(),
                AncientAetherBlocks.ANGELIC_CORNER_BRICK.get(),
                AncientAetherBlocks.AEROGETIC_STONE.get(),
                AncientAetherBlocks.AERONAUTIC_STONE.get(),
                AncientAetherBlocks.CORRUPTED_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.CARVED_STONE_MOSAIC.get(),
                AncientAetherBlocks.ANGELIC_STONE_MOSAIC.get(),
                AncientAetherBlocks.HELLFIRE_STONE_MOSAIC.get(),
                AncientAetherBlocks.AEROGETIC_STONE.get(),
                AncientAetherBlocks.GALE_STONE_MOSAIC.get()
        );
        tag(AetherTags.Blocks.SENTRY_BLOCKS).add(
                AncientAetherBlocks.CARVED_TILES.get(),
                AncientAetherBlocks.CARVED_TILE_STAIRS.get(),
                AncientAetherBlocks.CARVED_TILE_SLAB.get(),
                AncientAetherBlocks.CARVED_TILE_WALL.get(),
                AncientAetherBlocks.LOCKED_CARVED_TILES.get(),
                AncientAetherBlocks.TRAPPED_CARVED_TILES.get(),
                AncientAetherBlocks.CARVED_STONE_MOSAIC.get(),
                AncientAetherBlocks.LOCKED_CARVED_STONE_MOSAIC.get(),
                AncientAetherBlocks.WYND_SENTRY_STONE.get(),
                AncientAetherBlocks.LOCKED_WYND_SENTRY_STONE.get(),
                AncientAetherBlocks.BOSS_DOORWAY_WYND_SENTRY_STONE.get(),
                AncientAetherBlocks.TREASURE_DOORWAY_WYND_SENTRY_STONE.get()
        );
        tag(AetherTags.Blocks.ANGELIC_BLOCKS).add(
                AncientAetherBlocks.ANGELIC_CORNER_BRICK.get(),
                AncientAetherBlocks.ANGELIC_STONE_MOSAIC.get(),
                AncientAetherBlocks.LOCKED_ANGELIC_STONE_MOSAIC.get()
        ).addTags(
                AncientAetherTags.Blocks.VALKYRIE_BLOCKS
        );
        tag(AetherTags.Blocks.HELLFIRE_BLOCKS).add(
                AncientAetherBlocks.HELLFIRE_STONE_MOSAIC.get(),
                AncientAetherBlocks.LOCKED_HELLFIRE_STONE_MOSAIC.get()
        );
        tag(AetherTags.Blocks.SLIDER_UNBREAKABLE).add(
                AncientAetherBlocks.ANCIENT_OBELISK.get()
        );
        tag(AetherTags.Blocks.VALKYRIE_QUEEN_UNBREAKABLE).add(
                AncientAetherBlocks.ANCIENT_OBELISK.get()
        );
        tag(AetherTags.Blocks.NON_BRONZE_DUNGEON_SPAWNABLE).add(
                AetherBlocks.COLD_AERCLOUD.get()
        );
        tag(AetherTags.Blocks.GRAVITITE_ABILITY_BLACKLIST).add(
                AncientAetherBlocks.VALKYRUM_ORE.get(),
                AncientAetherBlocks.HIGHSPROOT_BUTTON.get(),
                AncientAetherBlocks.HIGHSPROOT_PRESSURE_PLATE.get(),
                AncientAetherBlocks.SAKURA_BUTTON.get(),
                AncientAetherBlocks.SAKURA_PRESSURE_PLATE.get(),
                AncientAetherBlocks.VALKYRUM_BLOCK.get()
        );
        tag(AetherTags.Blocks.COCKATRICE_SPAWNABLE_BLACKLIST).addTags(
                AncientAetherTags.Blocks.AEROGETIC_BLOCKS
        );

        tag(Tags.Blocks.BOOKSHELVES).add(
                AncientAetherBlocks.HIGHSPROOT_BOOKSHELF.get(),
                AncientAetherBlocks.SAKURA_BOOKSHELF.get()
        );
        tag(Tags.Blocks.FENCE_GATES).add(
                AncientAetherBlocks.HIGHSPROOT_FENCE_GATE.get(),
                AncientAetherBlocks.SAKURA_FENCE_GATE.get()
        );
        tag(Tags.Blocks.FENCE_GATES_WOODEN).add(
                AncientAetherBlocks.HIGHSPROOT_FENCE_GATE.get(),
                AncientAetherBlocks.SAKURA_FENCE_GATE.get()
        );
        tag(Tags.Blocks.FENCES).add(
                AncientAetherBlocks.HIGHSPROOT_FENCE.get(),
                AncientAetherBlocks.SAKURA_FENCE.get()
        );
        tag(Tags.Blocks.FENCES_WOODEN).add(
                AncientAetherBlocks.HIGHSPROOT_FENCE.get(),
                AncientAetherBlocks.SAKURA_FENCE.get()
        );
        tag(Tags.Blocks.GLASS_BLOCKS).add(
                AncientAetherBlocks.AEROGEL_GLASS.get()
        );
        tag(Tags.Blocks.GLASS_BLOCKS_COLORLESS).add(
                AncientAetherBlocks.AEROGEL_GLASS.get()
        );
        tag(Tags.Blocks.GLASS_PANES).add(
                AncientAetherBlocks.AEROGEL_GLASS_PANE.get()
        );
        tag(Tags.Blocks.GLASS_PANES_COLORLESS).add(
                AncientAetherBlocks.AEROGEL_GLASS_PANE.get()
        );
        tag(Tags.Blocks.ORE_RATES_SINGULAR).add(
                AncientAetherBlocks.AETHER_QUARTZ_ORE.get(),
                AncientAetherBlocks.VALKYRUM_ORE.get()
        );
        tag(Tags.Blocks.ORES).add(
                AncientAetherBlocks.AETHER_QUARTZ_ORE.get(),
                AncientAetherBlocks.VALKYRUM_ORE.get()
        );
        tag(Tags.Blocks.STORAGE_BLOCKS).add(
                AncientAetherBlocks.VALKYRUM_BLOCK.get()
        );

        tag(BlockTags.WOOL).add(
                AncientAetherBlocks.FLUFFALO_WOOL.get()
        );
        tag(BlockTags.WOODEN_BUTTONS).add(
                AncientAetherBlocks.HIGHSPROOT_BUTTON.get(),
                AncientAetherBlocks.SAKURA_BUTTON.get()
        );
        tag(BlockTags.WOOL_CARPETS).add(
                AncientAetherBlocks.FLUFFALO_CARPET.get()
        );
        tag(BlockTags.WOODEN_DOORS).add(
                AncientAetherBlocks.HIGHSPROOT_DOOR.get(),
                AncientAetherBlocks.SAKURA_DOOR.get()
        );
        tag(BlockTags.WOODEN_STAIRS).add(
                AncientAetherBlocks.HIGHSPROOT_STAIRS.get(),
                AncientAetherBlocks.SAKURA_STAIRS.get()
        );
        tag(BlockTags.WOODEN_SLABS).add(
                AncientAetherBlocks.HIGHSPROOT_SLAB.get(),
                AncientAetherBlocks.SAKURA_SLAB.get()
        );
        tag(BlockTags.WOODEN_FENCES).add(
                AncientAetherBlocks.HIGHSPROOT_FENCE.get(),
                AncientAetherBlocks.SAKURA_FENCE.get()
        );
        tag(BlockTags.WOODEN_PRESSURE_PLATES).add(
                AncientAetherBlocks.HIGHSPROOT_PRESSURE_PLATE.get(),
                AncientAetherBlocks.SAKURA_PRESSURE_PLATE.get()
        );
        tag(BlockTags.WOODEN_TRAPDOORS).add(
                AncientAetherBlocks.HIGHSPROOT_TRAPDOOR.get(),
                AncientAetherBlocks.SAKURA_TRAPDOOR.get()
        );
        tag(BlockTags.SAPLINGS).add(
                AncientAetherBlocks.CRYSTAL_SKYROOT_SAPLING.get(),
                AncientAetherBlocks.ENCHANTED_SKYROOT_SAPLING.get(),
                AncientAetherBlocks.SKYROOT_PINE_SAPLING.get(),
                AncientAetherBlocks.BLUE_SKYROOT_PINE_SAPLING.get(),
                AncientAetherBlocks.HIGHSPROOT_SAPLING.get(),
                AncientAetherBlocks.SAKURA_SAPLING.get()
        );
        tag(BlockTags.LOGS_THAT_BURN).addTags(
                AncientAetherTags.Blocks.HIGHSPROOT_LOGS,
                AncientAetherTags.Blocks.SAKURA_LOGS
        );
        tag(BlockTags.STAIRS).add(
                AncientAetherBlocks.CARVED_TILE_STAIRS.get(),
                AncientAetherBlocks.VALKYRIE_BRICK_STAIRS.get(),
                AncientAetherBlocks.VALKYRIE_TILE_STAIRS.get(),
                AncientAetherBlocks.AEROGETIC_STAIRS.get()
        );
        tag(BlockTags.SLABS).add(
                AncientAetherBlocks.CARVED_TILE_SLAB.get(),
                AncientAetherBlocks.VALKYRIE_BRICK_SLAB.get(),
                AncientAetherBlocks.VALKYRIE_TILE_SLAB.get(),
                AncientAetherBlocks.AEROGETIC_SLAB.get()
        );
        tag(BlockTags.WALLS).add(
                AncientAetherBlocks.HIGHSPROOT_LOG_WALL.get(),
                AncientAetherBlocks.HIGHSPROOT_WOOD_WALL.get(),
                AncientAetherBlocks.STRIPPED_HIGHSPROOT_LOG_WALL.get(),
                AncientAetherBlocks.STRIPPED_HIGHSPROOT_WOOD_WALL.get(),
                AncientAetherBlocks.SAKURA_LOG_WALL.get(),
                AncientAetherBlocks.SAKURA_WOOD_WALL.get(),
                AncientAetherBlocks.STRIPPED_SAKURA_LOG_WALL.get(),
                AncientAetherBlocks.STRIPPED_SAKURA_WOOD_WALL.get(),
                AncientAetherBlocks.CARVED_TILE_WALL.get(),
                AncientAetherBlocks.VALKYRIE_BRICK_WALL.get(),
                AncientAetherBlocks.VALKYRIE_TILE_WALL.get(),
                AncientAetherBlocks.AEROGETIC_WALL.get()
        );
        tag(BlockTags.LEAVES).add(
                AncientAetherBlocks.CRYSTAL_SKYROOT_LEAVES.get(),
                AncientAetherBlocks.ENCHANTED_SKYROOT_LEAVES.get(),
                AncientAetherBlocks.SKYROOT_PINE_LEAVES.get(),
                AncientAetherBlocks.BLUE_SKYROOT_PINE_LEAVES.get(),
                AncientAetherBlocks.HIGHSPROOT_LEAVES.get(),
                AncientAetherBlocks.SAKURA_LEAVES.get()
        );
        tag(BlockTags.SMALL_FLOWERS).add(
                AncientAetherBlocks.SUNSET_ROSE.get(),
                AncientAetherBlocks.SKY_BLUES.get(),
                AncientAetherBlocks.WYND_THISTLE.get(),
                AncientAetherBlocks.ELEVETIA.get()
        );
        tag(BlockTags.FLOWER_POTS).add(
                AncientAetherBlocks.POTTED_CRYSTAL_SKYROOT_SAPLING.get(),
                AncientAetherBlocks.POTTED_ENCHANTED_SKYROOT_SAPLING.get(),
                AncientAetherBlocks.POTTED_SKYROOT_PINE_SAPLING.get(),
                AncientAetherBlocks.POTTED_HIGHSPROOT_SAPLING.get(),
                AncientAetherBlocks.POTTED_SAKURA_SAPLING.get(),
                AncientAetherBlocks.POTTED_SUNSET_ROSE.get(),
                AncientAetherBlocks.POTTED_SKY_BLUES.get(),
                AncientAetherBlocks.POTTED_WYND_THISTLE.get(),
                AncientAetherBlocks.POTTED_ELEVETIA.get()
        );
        tag(BlockTags.STANDING_SIGNS).add(
                AncientAetherBlocks.HIGHSPROOT_SIGN.get(),
                AncientAetherBlocks.SAKURA_SIGN.get()
        );
        tag(BlockTags.WALL_SIGNS).add(
                AncientAetherBlocks.HIGHSPROOT_WALL_SIGN.get(),
                AncientAetherBlocks.SAKURA_WALL_SIGN.get()
        );
        tag(BlockTags.CEILING_HANGING_SIGNS).add(
                AncientAetherBlocks.HIGHSPROOT_HANGING_SIGN.get(),
                AncientAetherBlocks.SAKURA_HANGING_SIGN.get()
        );
        tag(BlockTags.WALL_HANGING_SIGNS).add(
                AncientAetherBlocks.HIGHSPROOT_WALL_HANGING_SIGN.get(),
                AncientAetherBlocks.SAKURA_WALL_HANGING_SIGN.get()
        );
        tag(BlockTags.DRAGON_IMMUNE).add(
                AncientAetherBlocks.ANCIENT_OBELISK.get()
        );
        tag(BlockTags.WITHER_IMMUNE).add(
                AncientAetherBlocks.ANCIENT_OBELISK.get()
        );
        tag(BlockTags.BEACON_BASE_BLOCKS).add(
                AncientAetherBlocks.VALKYRUM_BLOCK.get()
        );
        tag(BlockTags.CLIMBABLE).add(
                AncientAetherBlocks.GRAPE_VINE.get()
        );
        tag(BlockTags.MINEABLE_WITH_AXE).add(
                AncientAetherBlocks.SKY_GRASS.get(),
                AncientAetherBlocks.HIGHSPROOT_LOG.get(),
                AncientAetherBlocks.HIGHSPROOT_WOOD.get(),
                AncientAetherBlocks.STRIPPED_HIGHSPROOT_LOG.get(),
                AncientAetherBlocks.STRIPPED_HIGHSPROOT_WOOD.get(),
                AncientAetherBlocks.SAKURA_LOG.get(),
                AncientAetherBlocks.SAKURA_WOOD.get(),
                AncientAetherBlocks.STRIPPED_SAKURA_LOG.get(),
                AncientAetherBlocks.STRIPPED_SAKURA_WOOD.get(),
                AncientAetherBlocks.HIGHSPROOT_LOG_WALL.get(),
                AncientAetherBlocks.HIGHSPROOT_WOOD_WALL.get(),
                AncientAetherBlocks.STRIPPED_HIGHSPROOT_LOG_WALL.get(),
                AncientAetherBlocks.STRIPPED_HIGHSPROOT_WOOD_WALL.get(),
                AncientAetherBlocks.SAKURA_LOG_WALL.get(),
                AncientAetherBlocks.SAKURA_WOOD_WALL.get(),
                AncientAetherBlocks.STRIPPED_SAKURA_LOG_WALL.get(),
                AncientAetherBlocks.STRIPPED_SAKURA_WOOD_WALL.get(),
                AncientAetherBlocks.HIGHSPROOT_PLANKS.get(),
                AncientAetherBlocks.HIGHSPROOT_STAIRS.get(),
                AncientAetherBlocks.HIGHSPROOT_SLAB.get(),
                AncientAetherBlocks.HIGHSPROOT_FENCE.get(),
                AncientAetherBlocks.HIGHSPROOT_FENCE_GATE.get(),
                AncientAetherBlocks.HIGHSPROOT_DOOR.get(),
                AncientAetherBlocks.HIGHSPROOT_TRAPDOOR.get(),
                AncientAetherBlocks.HIGHSPROOT_BUTTON.get(),
                AncientAetherBlocks.HIGHSPROOT_PRESSURE_PLATE.get(),
                AncientAetherBlocks.HIGHSPROOT_SIGN.get(),
                AncientAetherBlocks.HIGHSPROOT_WALL_SIGN.get(),
                AncientAetherBlocks.HIGHSPROOT_HANGING_SIGN.get(),
                AncientAetherBlocks.HIGHSPROOT_WALL_HANGING_SIGN.get(),
                AncientAetherBlocks.HIGHSPROOT_BOOKSHELF.get(),
                AncientAetherBlocks.SAKURA_PLANKS.get(),
                AncientAetherBlocks.SAKURA_STAIRS.get(),
                AncientAetherBlocks.SAKURA_SLAB.get(),
                AncientAetherBlocks.SAKURA_FENCE.get(),
                AncientAetherBlocks.SAKURA_FENCE_GATE.get(),
                AncientAetherBlocks.SAKURA_DOOR.get(),
                AncientAetherBlocks.SAKURA_TRAPDOOR.get(),
                AncientAetherBlocks.SAKURA_BUTTON.get(),
                AncientAetherBlocks.SAKURA_PRESSURE_PLATE.get(),
                AncientAetherBlocks.SAKURA_SIGN.get(),
                AncientAetherBlocks.SAKURA_WALL_SIGN.get(),
                AncientAetherBlocks.SAKURA_HANGING_SIGN.get(),
                AncientAetherBlocks.SAKURA_WALL_HANGING_SIGN.get(),
                AncientAetherBlocks.SAKURA_BOOKSHELF.get(),
                AncientAetherBlocks.AMBROSIUM_CAMPFIRE.get()
        );
        tag(BlockTags.MINEABLE_WITH_HOE).add(
                AncientAetherBlocks.CRYSTAL_SKYROOT_LEAVES.get(),
                AncientAetherBlocks.ENCHANTED_SKYROOT_LEAVES.get(),
                AncientAetherBlocks.SKYROOT_PINE_LEAVES.get(),
                AncientAetherBlocks.BLUE_SKYROOT_PINE_LEAVES.get(),
                AncientAetherBlocks.HIGHSPROOT_LEAVES.get(),
                AncientAetherBlocks.SAKURA_LEAVES.get(),
                AncientAetherBlocks.VIOLET_AERCLOUD.get(),
                AncientAetherBlocks.WIND_BLOWER.get()
        );
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                AncientAetherBlocks.WYND_ICE.get(),
                AncientAetherBlocks.AETHER_QUARTZ_ORE.get(),
                AncientAetherBlocks.VALKYRUM_ORE.get(),
                AncientAetherBlocks.ATMOSINE_CRYSTAL.get(),
                AncientAetherBlocks.VALKYRUM_BLOCK.get(),
                AncientAetherBlocks.AEROGEL_GLASS.get(),
                AncientAetherBlocks.AEROGEL_GLASS_PANE.get(),
                AncientAetherBlocks.AEROGEL_GLASS_DOOR.get(),
                AncientAetherBlocks.AEROGEL_GLASS_TRAPDOOR.get(),
                AncientAetherBlocks.CARVED_TILES.get(),
                AncientAetherBlocks.WYND_SENTRY_STONE.get(),
                AncientAetherBlocks.CARVED_TILE_STAIRS.get(),
                AncientAetherBlocks.CARVED_TILE_SLAB.get(),
                AncientAetherBlocks.CARVED_TILE_WALL.get(),
                AncientAetherBlocks.ANGELIC_CORNER_BRICK.get(),
                AncientAetherBlocks.VALKYRIE_BRICKS.get(),
                AncientAetherBlocks.VALKYRIE_BRICK_STAIRS.get(),
                AncientAetherBlocks.VALKYRIE_BRICK_SLAB.get(),
                AncientAetherBlocks.VALKYRIE_BRICK_WALL.get(),
                AncientAetherBlocks.VALKYRIE_TILES.get(),
                AncientAetherBlocks.VALKYRIE_TILE_STAIRS.get(),
                AncientAetherBlocks.VALKYRIE_TILE_SLAB.get(),
                AncientAetherBlocks.VALKYRIE_TILE_WALL.get(),
                AncientAetherBlocks.AEROGETIC_STONE.get(),
                AncientAetherBlocks.AERONAUTIC_STONE.get(),
                AncientAetherBlocks.CORRUPTED_AERONAUTIC_STONE.get(),
                AncientAetherBlocks.AEROGETIC_STAIRS.get(),
                AncientAetherBlocks.AEROGETIC_SLAB.get(),
                AncientAetherBlocks.AEROGETIC_WALL.get(),
                AncientAetherBlocks.HOLYSTONE_BRICK_MOSAIC.get(),
                AncientAetherBlocks.CARVED_STONE_MOSAIC.get(),
                AncientAetherBlocks.ANGELIC_STONE_MOSAIC.get(),
                AncientAetherBlocks.HELLFIRE_STONE_MOSAIC.get(),
                AncientAetherBlocks.AEROGETIC_STONE_MOSAIC.get(),
                AncientAetherBlocks.GALE_STONE_MOSAIC.get(),
                AncientAetherBlocks.AMBROSIUM_LANTERN.get(),
                AncientAetherBlocks.WYND_LANTERN.get(),
                AncientAetherBlocks.SUN_LANTERN.get(),
                AncientAetherBlocks.SLIDER_PROTOTYPE.get(),
                AncientAetherBlocks.POWERED_OBELISK.get()
        );
        tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
                AncientAetherBlocks.GRAVITY_GRAVEL.get(),
                AncientAetherBlocks.VALKYRIE_CLAY.get()
        );
        tag(BlockTags.SWORD_EFFICIENT).add(
                AncientAetherBlocks.SKY_GRASS.get()
        );
        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                AncientAetherBlocks.SLIDER_PROTOTYPE.get(),
                AncientAetherBlocks.POWERED_OBELISK.get()
        );
        tag(BlockTags.NEEDS_STONE_TOOL).add(
                AncientAetherBlocks.CARVED_TILES.get(),
                AncientAetherBlocks.CARVED_TILE_STAIRS.get(),
                AncientAetherBlocks.CARVED_TILE_SLAB.get(),
                AncientAetherBlocks.CARVED_TILE_WALL.get(),
                AncientAetherBlocks.WYND_SENTRY_STONE.get(),
                AncientAetherBlocks.CARVED_STONE_MOSAIC.get(),
                AncientAetherBlocks.ANGELIC_STONE_MOSAIC.get(),
                AncientAetherBlocks.HELLFIRE_STONE_MOSAIC.get(),
                AncientAetherBlocks.AEROGETIC_STONE_MOSAIC.get(),
                AncientAetherBlocks.GALE_STONE_MOSAIC.get(),
                AncientAetherBlocks.AEROGETIC_STONE.get(),
                AncientAetherBlocks.AEROGETIC_STAIRS.get(),
                AncientAetherBlocks.AEROGETIC_SLAB.get(),
                AncientAetherBlocks.AEROGETIC_WALL.get(),
                AncientAetherBlocks.AERONAUTIC_STONE.get(),
                AncientAetherBlocks.CORRUPTED_AERONAUTIC_STONE.get()
        );
        tag(BlockTags.REPLACEABLE_BY_TREES).add(
                AncientAetherBlocks.SKY_GRASS.get()
        );
        tag(BlockTags.REPLACEABLE).add(
                AncientAetherBlocks.SKY_GRASS.get()
        );
        tag(BlockTags.ENCHANTMENT_POWER_TRANSMITTER).add(
                AncientAetherBlocks.SKY_GRASS.get()
        );
    }
}