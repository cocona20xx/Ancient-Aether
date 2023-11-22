package net.builderdog.ancient_aether.world.biomes;

import com.aetherteam.aether.data.resources.registries.AetherBiomes;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import teamrazor.aeroblender.aether.AetherRegionType;
import terrablender.api.Region;

import java.util.function.Consumer;


public class AncientAetherRegion extends Region {

    public AncientAetherRegion(ResourceLocation name, int weight)
    {
        super(name, AetherRegionType.THE_AETHER, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        Climate.Parameter fullRange = Climate.Parameter.span(-1.5F, 1.5F);
        Climate.Parameter inland = Climate.Parameter.span(0.3F, 1.5F);
        Climate.Parameter coast = Climate.Parameter.span(0.2F, 0.3F);
        Climate.Parameter inlandBlended = Climate.Parameter.span(-1.5F, 0.38F);
        Climate.Parameter coastBlended = Climate.Parameter.span(0.38F, 1.5F);
        Climate.Parameter wyndcaps1 = Climate.Parameter.span(-1.5F, -0.65F);
        Climate.Parameter wyndcaps2 = Climate.Parameter.span(-0.65F, -0.575F);
        Climate.Parameter skyroot1 = Climate.Parameter.span(-0.575F, -0.5F);
        Climate.Parameter skyroot2 = Climate.Parameter.span(-0.5F, -0.25F);
        Climate.Parameter skyroot3 = Climate.Parameter.span(-0.25F, 0.25F);
        Climate.Parameter skyroot4 = Climate.Parameter.span(0.25F, 0.5F);
        Climate.Parameter skyroot5 = Climate.Parameter.span(0.5F, 0.575F);
        Climate.Parameter skyrootFullRange = Climate.Parameter.span(-0.575F, 0.575F);
        Climate.Parameter sakura = Climate.Parameter.span(0.575F, 1.5F);
        Climate.Parameter mythicalErosion1 = Climate.Parameter.span(0.45F, 1.5F);
        Climate.Parameter mythicalErosion2 = Climate.Parameter.span(0.35F, 0.45F);

        //Wyndcaps
        //addBiome(mapper, new Climate.ParameterPoint(wyndcaps1, Climate.Parameter.span(-1.5F, 0.15F), Climate.Parameter.span(0.34F, 0.47F), fullRange, fullRange, fullRange, 0),
        //        AncientAetherBiomes.WYNDCAP_TAIGA);
        //addBiome(mapper, new Climate.ParameterPoint(wyndcaps1, Climate.Parameter.span(0.15F, 1.5F), Climate.Parameter.span(0.34F, 0.47F), fullRange, fullRange, fullRange, 0),
        //        AncientAetherBiomes.FESTIVE_WYNDCAP_TAIGA);
        //addBiome(mapper, new Climate.ParameterPoint(wyndcaps1, fullRange, Climate.Parameter.span(0.47F, 1.5F), fullRange, Climate.Parameter.span(0F, 1.5F), fullRange, 0),
        //        AncientAetherBiomes.WYNDCAP_HIGHLAND);
        //addBiome(mapper, new Climate.ParameterPoint(wyndcaps1, fullRange, Climate.Parameter.span(0.47F, 1.5F), fullRange, Climate.Parameter.span(-1.5F, 0F), fullRange, 0),
        //        AncientAetherBiomes.WYNDCAP_PEAKS);

        // addBiome(mapper, new Climate.ParameterPoint(wyndcaps2, Climate.Parameter.span(-1.5F, 0.15F), Climate.Parameter.span(0.34F, 0.47F), fullRange, inlandBlended, fullRange, 0),
        //        AncientAetherBiomes.WYNDCAP_TAIGA);
        //addBiome(mapper, new Climate.ParameterPoint(wyndcaps2, Climate.Parameter.span(0.15F, 1.5F), Climate.Parameter.span(0.34F, 0.47F), fullRange, inlandBlended, fullRange, 0),
        //        AncientAetherBiomes.FESTIVE_WYNDCAP_TAIGA);
        //addBiome(mapper, new Climate.ParameterPoint(wyndcaps2, fullRange, Climate.Parameter.span(0.47F, 1.5F), fullRange, Climate.Parameter.span(0F, 0.48F), fullRange, 0),
        //        AncientAetherBiomes.WYNDCAP_HIGHLAND);
        //addBiome(mapper, new Climate.ParameterPoint(wyndcaps2, fullRange, Climate.Parameter.span(0.47F, 1.5F), fullRange, Climate.Parameter.span(-1.5F, 0F), fullRange, 0),
        //        AncientAetherBiomes.WYNDCAP_PEAKS);
        //addBiome(mapper, new Climate.ParameterPoint(wyndcaps2, fullRange, Climate.Parameter.span(0.34F, 1.5F), fullRange, coastBlended, fullRange, 0),
        //        AncientAetherBiomes.ICY_COAST);

        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-1.5F, -0.575F), fullRange, coast, fullRange, fullRange, fullRange, 0),
        //        AncientAetherBiomes.ICY_COAST);

        //Skyroot Biomes

        addBiome(mapper, new Climate.ParameterPoint(skyroot2, Climate.Parameter.span(-1.5F, -0.25F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AncientAetherBiomes.SKYROOT_FIELDS);
        addBiome(mapper, new Climate.ParameterPoint(skyroot2, Climate.Parameter.span(-0.25F, 0.25F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AetherBiomes.SKYROOT_WOODLAND);
        addBiome(mapper, new Climate.ParameterPoint(skyroot2, Climate.Parameter.span(0.25F, 1.5F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AncientAetherBiomes.SKYROOT_FIELDS);

        addBiome(mapper, new Climate.ParameterPoint(skyroot3, Climate.Parameter.span(-1.5F, -0.25F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AetherBiomes.SKYROOT_MEADOW);
        addBiome(mapper, new Climate.ParameterPoint(skyroot3, Climate.Parameter.span(-0.25F, -0.05F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AetherBiomes.SKYROOT_GROVE);
        addBiome(mapper, new Climate.ParameterPoint(skyroot3, Climate.Parameter.span(-0.05F, 0.1F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AetherBiomes.SKYROOT_WOODLAND);
        addBiome(mapper, new Climate.ParameterPoint(skyroot3, Climate.Parameter.span(0.1F, 0.2F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AetherBiomes.SKYROOT_FOREST);
        addBiome(mapper, new Climate.ParameterPoint(skyroot3, Climate.Parameter.span(0.2F, 1.5F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AetherBiomes.SKYROOT_MEADOW);

        addBiome(mapper, new Climate.ParameterPoint(skyroot4, Climate.Parameter.span(-1.5F, -0.2F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AetherBiomes.SKYROOT_MEADOW);
        addBiome(mapper, new Climate.ParameterPoint(skyroot4, Climate.Parameter.span(-0.2F, -0.1F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AetherBiomes.SKYROOT_GROVE);
        addBiome(mapper, new Climate.ParameterPoint(skyroot4, Climate.Parameter.span(-0.1F, -0.03F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AetherBiomes.SKYROOT_FOREST);
        addBiome(mapper, new Climate.ParameterPoint(skyroot4, Climate.Parameter.span(-0.03F, 0.17F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AetherBiomes.SKYROOT_GROVE);
        addBiome(mapper, new Climate.ParameterPoint(skyroot4, Climate.Parameter.span(0.17F, 1.5F), inland, Climate.Parameter.span(-1.5F, 0.25F), fullRange, fullRange, 0),
                AetherBiomes.SKYROOT_MEADOW);

        //Mythical Forests
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.575F, -0.5F), Climate.Parameter.span(-1.5F, -0.225F), inland, mythicalErosion1, inlandBlended, fullRange, 0),
        //        AncientAetherBiomes.MYTHICAL_CLEARING);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.575F, -0.5F), Climate.Parameter.span(-0.225F, 0.225F), inland, mythicalErosion1, inlandBlended, fullRange, 0),
        //        AncientAetherBiomes.MYTHICAL_FOREST);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.575F, -0.5F), Climate.Parameter.span( 0.225F, 1.5F), inland, mythicalErosion1, inlandBlended, fullRange, 0),
        //         AncientAetherBiomes.MYTHICAL_CLEARING);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.575F, -0.5F), fullRange, inland, mythicalErosion1, coastBlended, fullRange, 0),
        //        AncientAetherBiomes.DIVINE_COAST);

        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.span(-1.5F, -0.225F), inland, mythicalErosion1, fullRange, fullRange, 0),
        //        AncientAetherBiomes.MYTHICAL_CLEARING);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.span(-0.225F, 0.225F), inland, mythicalErosion1, fullRange, fullRange, 0),
        //        AncientAetherBiomes.MYTHICAL_FOREST);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.5F, 0.5F), Climate.Parameter.span( 0.225F, 1.5F), inland, mythicalErosion1, fullRange, fullRange, 0),
        //        AncientAetherBiomes.MYTHICAL_CLEARING);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.575F, 0.575F), fullRange, coast, mythicalErosion1, fullRange, fullRange, 0),
        //        AncientAetherBiomes.DIVINE_COAST);

        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(0.5F, 0.575F), Climate.Parameter.span(-1.5F, -0.225F), inland, mythicalErosion1, inlandBlended, fullRange, 0),
        //        AncientAetherBiomes.MYTHICAL_CLEARING);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(0.5F, 0.575F), Climate.Parameter.span(-0.225F, 0.225F), inland, mythicalErosion1, inlandBlended, fullRange, 0),
        //        AncientAetherBiomes.MYTHICAL_FOREST);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(0.5F, 0.575F), Climate.Parameter.span( 0.225F, 1.5F), inland, mythicalErosion1, inlandBlended, fullRange, 0),
        //        AncientAetherBiomes.MYTHICAL_CLEARING);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(0.5F, 0.575F), fullRange, inland, mythicalErosion1, coastBlended, fullRange, 0),
        //        AncientAetherBiomes.DIVINE_COAST);

        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.575F, 0.575F), Climate.Parameter.span(-1.5F, -0.225F), inland, mythicalErosion2, inlandBlended, fullRange, 0),
        //        AncientAetherBiomes.MYTHICAL_CLEARING);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.575F, 0.575F), Climate.Parameter.span(-0.225F, 0.225F), inland, mythicalErosion2, inlandBlended, fullRange, 0),
        //        AncientAetherBiomes.MYTHICAL_FOREST);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.575F, 0.575F), Climate.Parameter.span( 0.225F, 1.5F), inland, mythicalErosion2, inlandBlended, fullRange, 0),
        //        AncientAetherBiomes.MYTHICAL_CLEARING);
        //addBiome(mapper, new Climate.ParameterPoint(Climate.Parameter.span(-0.575F, 0.575F), fullRange, inland, Climate.Parameter.span(0.35F, 1.5F), coastBlended, fullRange, 0),
        //        AncientAetherBiomes.DIVINE_COAST);

        //Sakura Jungle
        //addBiome(mapper, new Climate.ParameterPoint(sakura, Climate.Parameter.span(-1.5F, 0.25F), Climate.Parameter.span(0.25F, 1.5F), fullRange, fullRange, fullRange, 0),
        //        AncientAetherBiomes.SAKURA_JUNGLE);
        //addBiome(mapper, new Climate.ParameterPoint(sakura, Climate.Parameter.span(0.25F, 1.5F), Climate.Parameter.span(0.25F, 1.5F), fullRange, fullRange, fullRange, 0),
        //        AncientAetherBiomes.SKYROOT_JUNGLE);

        //Cloud Ocean
    }
}