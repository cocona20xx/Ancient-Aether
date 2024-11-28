package net.builderdog.ancient_aether.advancement;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.ContextAwarePredicate;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.SimpleCriterionTrigger;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class ObeliskTrigger extends SimpleCriterionTrigger<ObeliskTrigger.Instance> {
    @Override
    public @NotNull Codec<Instance> codec() {
        return Instance.CODEC;
    }

    public void trigger(ServerPlayer player, ItemStack stack) {
        trigger(player, (instance) -> instance.test(stack));
    }

    public record Instance(Optional<ContextAwarePredicate> player, Optional<ItemPredicate> item) implements SimpleInstance {
        public static final Codec<Instance> CODEC = RecordCodecBuilder.create(instance -> instance.group(
                        EntityPredicate.ADVANCEMENT_CODEC.optionalFieldOf("player").forGetter(Instance::player),
                        ItemPredicate.CODEC.optionalFieldOf("item").forGetter(Instance::item))
                .apply(instance, Instance::new));

        public static Criterion<Instance> forItem(ItemPredicate item) {
            return AncientAetherTriggers.OBELISK_ACTIVATION.get().createCriterion(new Instance(Optional.empty(), Optional.of(item)));
        }

        public static Criterion<Instance> forItem(ItemLike item) {
            return forItem(ItemPredicate.Builder.item().of(item).build());
        }

        //TODO: is this actually the closest equiv. to 1.20.4 ItemPredicate#matches?
        public boolean test(ItemStack stack) {
            return item.isEmpty() || item.get().test(stack);
        }
    }
}