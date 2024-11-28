package net.builderdog.ancient_aether;

import net.builderdog.ancient_aether.advancement.AncientAetherTriggers;
import net.builderdog.ancient_aether.attachments.AncientAetherDataAttachments;
import net.builderdog.ancient_aether.block.AncientAetherBlockSets;
import net.builderdog.ancient_aether.block.AncientAetherBlocks;
import net.builderdog.ancient_aether.block.dispenser.DispenseAncientAetherBoatBehavior;
import net.builderdog.ancient_aether.blockentity.AncientAetherBlockEntityTypes;
import net.builderdog.ancient_aether.client.AncientAetherClient;
import net.builderdog.ancient_aether.client.AncientAetherSoundEvents;
import net.builderdog.ancient_aether.client.particle.AncientAetherParticleTypes;
import net.builderdog.ancient_aether.data.AncientAetherData;
import net.builderdog.ancient_aether.effect.AncientAetherEffects;
import net.builderdog.ancient_aether.entity.AncientAetherEntityTypes;
import net.builderdog.ancient_aether.event.listeners.*;
import net.builderdog.ancient_aether.event.listeners.ability.ArmorAbilityListener;
import net.builderdog.ancient_aether.event.listeners.ability.ToolAbilityListener;
import net.builderdog.ancient_aether.event.listeners.ability.WeaponAbilityListener;
import net.builderdog.ancient_aether.item.AncientAetherCreativeModeTabs;
import net.builderdog.ancient_aether.item.AncientAetherItems;
import net.builderdog.ancient_aether.world.biome.AncientAetherRegion;
import net.builderdog.ancient_aether.world.biome.AncientAetherSurfaceRules;
import net.builderdog.ancient_aether.world.density.AncientAetherDensityFunctionTypes;
import net.builderdog.ancient_aether.world.feature.AncientAetherFeatures;
import net.builderdog.ancient_aether.world.structure.AncientAetherStructureProcessors;
import net.builderdog.ancient_aether.world.structure.AncientAetherStructureTypes;
import net.builderdog.ancient_aether.world.tree.foliage.AncientAetherFoliagePlacers;
import net.builderdog.ancient_aether.world.tree.decorator.AncientAetherTreeDecorators;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackSelectionConfig;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.level.block.DispenserBlock;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import io.github.razordevs.aeroblender.aether.AetherRuleCategory;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

import java.nio.file.Path;
import java.util.Optional;

@Mod(AncientAether.MODID)
public class AncientAether {
    public static final String MODID = "ancient_aether";

    public AncientAether(ModContainer mod, IEventBus bus, Dist dist) {
        bus.addListener(AncientAetherData::dataSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::packSetup);

        DeferredRegister<?>[] registers = {
                AncientAetherBlocks.BLOCKS,
                AncientAetherItems.ITEMS,
                AncientAetherBlockEntityTypes.BLOCK_ENTITY_TYPES,
                AncientAetherEntityTypes.ENTITY_TYPES,
                AncientAetherEffects.EFFECTS,
                AncientAetherFeatures.FEATURES,
                AncientAetherFoliagePlacers.FOLIAGE_PLACERS,
                AncientAetherTreeDecorators.TREE_DECORATORS,
                AncientAetherStructureTypes.STRUCTURE_TYPES,
                AncientAetherStructureProcessors.STRUCTURE_PROCESSOR_TYPES,
                AncientAetherDensityFunctionTypes.DENSITY_FUNCTION_TYPES,
                AncientAetherTriggers.TRIGGERS,
                AncientAetherSoundEvents.SOUNDS,
                AncientAetherParticleTypes.PARTICLES,
                AncientAetherDataAttachments.ATTACHMENTS
        };

        for (DeferredRegister<?> register : registers) {
            register.register(bus);
        }

        eventSetup(bus);

        AncientAetherBlockSets.registerWoodTypes();

        mod.registerConfig(ModConfig.Type.SERVER, AncientAetherConfig.SERVER_SPEC);
        mod.registerConfig(ModConfig.Type.COMMON, AncientAetherConfig.COMMON_SPEC);
        mod.registerConfig(ModConfig.Type.CLIENT, AncientAetherConfig.CLIENT_SPEC);

        if (dist == Dist.CLIENT) {
            AncientAetherClient.clientInit(bus);
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            AncientAetherBlocks.registerPots();
            AncientAetherBlocks.registerFlammability();
            registerDispenserBehaviors();

            Regions.register(new AncientAetherRegion(ResourceLocation.fromNamespaceAndPath(MODID, "ancient_aether"), AncientAetherConfig.COMMON.ancient_aether_region_weight.get()));
            SurfaceRuleManager.addSurfaceRules(AetherRuleCategory.THE_AETHER, MODID, AncientAetherSurfaceRules.makeRules());
        });
    }

    public void eventSetup(IEventBus neoBus) {
        IEventBus bus = NeoForge.EVENT_BUS;

        ArmorAbilityListener.listen(bus);
        ToolAbilityListener.listen(bus);
        WeaponAbilityListener.listen(bus);
        AttachmentListener.listen(bus);
        EntityListener.listen(bus);
        ItemListener.listen(bus);
        LevelListener.listen(bus);
        MenuListener.listen(bus);
        ServerListener.listen(bus);

        neoBus.addListener(AncientAetherCreativeModeTabs::buildCreativeModeTabs);
        neoBus.addListener(AncientAetherEntityTypes::registerSpawnPlacements);
        neoBus.addListener(AncientAetherEntityTypes::registerEntityAttributes);
    }

    private void registerDispenserBehaviors() {
        DispenserBlock.registerBehavior(AncientAetherItems.HIGHSPROOT_BOAT.get(), new DispenseAncientAetherBoatBehavior());
        DispenserBlock.registerBehavior(AncientAetherItems.HIGHSPROOT_CHEST_BOAT.get(), new DispenseAncientAetherBoatBehavior(true));
        DispenserBlock.registerBehavior(AncientAetherItems.SAKURA_BOAT.get(), new DispenseAncientAetherBoatBehavior());
        DispenserBlock.registerBehavior(AncientAetherItems.SAKURA_CHEST_BOAT.get(), new DispenseAncientAetherBoatBehavior(true));
    }

    public void packSetup(AddPackFindersEvent event) {
        if (event.getPackType() == PackType.CLIENT_RESOURCES) {
            Pack pack = createPack("builtin/ancient_aether_texture_tweaks",
                    "pack.ancient_aether.texture_tweaks.title",
                    PackSource.BUILT_IN,
                    "packs/ancient_aether_texture_tweaks",
                    PackType.CLIENT_RESOURCES,
                    new PackSelectionConfig(true, Pack.Position.TOP, false));
            event.addRepositorySource(consumer -> consumer.accept(pack));
        }

        if (event.getPackType() == PackType.CLIENT_RESOURCES) {
           Pack pack = createPack("builtin/ancient_aether_programmer_art",
                    "pack.ancient_aether.programmer_art.title",
                    PackSource.BUILT_IN,
                    "packs/ancient_aether_programmer_art",
                    PackType.CLIENT_RESOURCES,
                    new PackSelectionConfig(false, Pack.Position.TOP, false));
            event.addRepositorySource(consumer -> consumer.accept(pack));
        }

        if (event.getPackType() == PackType.SERVER_DATA) {
            Pack pack = createPack("builtin/ancient_aether_worldgen_overrides",
                    "pack.ancient_aether.worldgen_overrides.title",
                    PackSource.SERVER,
                    "packs/ancient_aether_worldgen_overrides",
                    PackType.SERVER_DATA,
                    new PackSelectionConfig(true, Pack.Position.TOP, false));
            event.addRepositorySource(consumer -> consumer.accept(pack));
        }
    }

    /**
     * Helper method for adding resource/data packs.
     * @author rinOfTheStars
     * @param packId The id or name of the pack (ex: {@code "builtin/ancient_aether_programmer_art"}).
     * @param packTitleTranslationKey The translation key for the pack's title.
     * @param packSource An object of type {@link PackSource}, usually {@link PackSource#BUILT_IN} or {@link PackSource#SERVER} depending on pack type.
     * @param packResPath The directory the pack's files are in, relative to {@code resources}.
     * @param packType An object of type {@link PackType}. Declares whether this pack is a resource pack or a data (serverside) pack.
     * @param packSelectionConfig An object of type {@link PackSelectionConfig}. Defines whether a given pack is required, the position that pack takes in the pack list by default, and if that position is fixed in place.
     * @return An object of {@link Pack} to register with the {@link AddPackFindersEvent} event.
     */
    private Pack createPack(String packId, String packTitleTranslationKey, PackSource packSource, String packResPath, PackType packType, PackSelectionConfig packSelectionConfig) {
        PackLocationInfo info = new PackLocationInfo(packId, Component.translatable(packTitleTranslationKey), packSource, Optional.empty());
        Path path = ModList.get().getModFileById(MODID).getFile().findResource(packResPath);
        return Pack.readMetaAndCreate(info, new PathPackResources.PathResourcesSupplier(path), packType, packSelectionConfig);
    }
}