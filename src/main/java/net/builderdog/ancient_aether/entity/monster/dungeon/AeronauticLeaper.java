package net.builderdog.ancient_aether.entity.monster.dungeon;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.client.AetherSoundEvents;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class AeronauticLeaper extends Slime {
	public static final EntityDataAccessor<Boolean> DATA_AWAKE_ID = SynchedEntityData.defineId(AeronauticLeaper.class, EntityDataSerializers.BOOLEAN);

	public float timeSpotted = 0.0F;

	public AeronauticLeaper(EntityType<? extends AeronauticLeaper> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	@Override
	protected void registerGoals() {
		goalSelector.addGoal(1, new AeronauticLeaper.FloatGoal(this));
		goalSelector.addGoal(2, new AeronauticLeaper.AttackGoal(this));
		goalSelector.addGoal(3, new AeronauticLeaper.RandomDirectionGoal(this));
		goalSelector.addGoal(5, new AeronauticLeaper.KeepOnJumpingGoal(this));
		targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, 10, true, false, (entity) -> Math.abs(entity.getY() - this.getY()) <= 5.0));
	}

	@Nonnull
	public static AttributeSupplier.Builder createMobAttributes() {
		return Mob.createMobAttributes()
				.add(Attributes.MAX_HEALTH, 10.0)
				.add(Attributes.MOVEMENT_SPEED, 0.8)
				.add(Attributes.ATTACK_DAMAGE, 8.0)
			    .add(ForgeMod.ENTITY_GRAVITY.get(), 0.025);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		entityData.define(DATA_AWAKE_ID, false);
	}

	@Override
	public void setSize(int size, boolean resetHealth) {}

	@Override
	public void remove(@Nonnull Entity.RemovalReason reason) {
		setRemoved(reason);
		if (reason == Entity.RemovalReason.KILLED) {
			gameEvent(GameEvent.ENTITY_DIE);
		}
		invalidateCaps();
	}

	public boolean isAwake() {
		return entityData.get(DATA_AWAKE_ID);
	}

	public void setAwake(boolean awake) {
		entityData.set(DATA_AWAKE_ID, awake);
	}

	@Override
	public void tick() {
		if (level().getNearestPlayer(getX(), getY(), getZ(), 8.0, EntitySelector.NO_SPECTATORS) != null) {
			if (!isAwake()) {
				if (timeSpotted >= 24) {
					setAwake(true);
				}
				timeSpotted++;
			}
		} else {
			setAwake(false);
		}
		super.tick();
	}

	@Override
	public @Nullable
	SpawnGroupData finalizeSpawn(@Nonnull ServerLevelAccessor level, @Nonnull DifficultyInstance difficulty, @Nonnull MobSpawnType reason, @Nullable SpawnGroupData spawnData, @Nullable CompoundTag tag) {
		setSize(1, true);
		setLeftHanded(false);
		return spawnData;
	}

	@Nonnull
	@Override
	protected ResourceLocation getDefaultLootTable() {
		return getType().getDefaultLootTable();
	}

	@Override
	protected SoundEvent getHurtSound(@Nonnull DamageSource damageSource) {
		return AetherSoundEvents.ENTITY_SENTRY_HURT.get();
	}

	@Override
	protected SoundEvent getDeathSound() {
		return AetherSoundEvents.ENTITY_SENTRY_DEATH.get();
	}

	protected boolean isDealsDamage() {
		return isEffectiveAi();
	}

	@Nonnull
	@Override
	protected SoundEvent getSquishSound() {
		return AetherSoundEvents.ENTITY_SENTRY_JUMP.get();
	}

	@Nonnull
	@Override
	protected SoundEvent getJumpSound() {
		return AetherSoundEvents.ENTITY_SENTRY_JUMP.get();
	}

	@Nonnull
	@Override
	public EntityDimensions getDimensions(@NotNull Pose pose) {
		return super.getDimensions(pose).scale(2*0.879F);
	}

	@Nonnull
	@Override
	protected ParticleOptions getParticleType() {
		return new BlockParticleOption(ParticleTypes.BLOCK, AetherBlocks.AEROGEL.get().defaultBlockState());
	}

	@SuppressWarnings("unchecked")
	@Nonnull
	@Override
	public EntityType<? extends AeronauticLeaper> getType() {
		return (EntityType<? extends AeronauticLeaper>) super.getType();
	}

	@Override
	protected boolean shouldDespawnInPeaceful() {
		return true;
	}

	protected void jumpFromGround() {
		if(isAwake()) {
			Vec3 vec3 = getDeltaMovement();
			setDeltaMovement(vec3.x, 0.25, vec3.z);
			hasImpulse = true;
		}
	}

	public static class AttackGoal extends SlimeAttackGoal {
		private final AeronauticLeaper sentry;

		public AttackGoal(AeronauticLeaper sentryIn) {
			super(sentryIn);
			sentry = sentryIn;
		}

		@Override
		public boolean canUse() {
			return sentry.isAwake() && canUse();
		}

		@Override
		public boolean canContinueToUse() {
			return sentry.isAwake() && canContinueToUse();
		}
	}

	public static class FloatGoal extends SlimeFloatGoal {
		private final AeronauticLeaper sentry;

		public FloatGoal(AeronauticLeaper sentryIn) {
			super(sentryIn);
			sentry = sentryIn;
		}

		@Override
		public boolean canUse() {
			return sentry.isAwake() && canUse();
		}

		@Override
		public boolean canContinueToUse() {
			return sentry.isAwake() && canContinueToUse();
		}
	}

	public static class KeepOnJumpingGoal extends SlimeKeepOnJumpingGoal {
		private final AeronauticLeaper sentry;

		public KeepOnJumpingGoal(AeronauticLeaper sentryIn) {
			super(sentryIn);
			sentry = sentryIn;
		}

		@Override
		public boolean canUse() {
			return sentry.isAwake() && canUse();
		}

		@Override
		public boolean canContinueToUse() {
			return sentry.isAwake() && canContinueToUse();
		}
	}

	public static class RandomDirectionGoal extends SlimeRandomDirectionGoal {
		private final AeronauticLeaper sentry;

		public RandomDirectionGoal(AeronauticLeaper sentryIn) {
			super(sentryIn);
			sentry = sentryIn;
		}

		@Override
		public boolean canUse() {
			return sentry.isAwake() && canUse();
		}

		@Override
		public boolean canContinueToUse() {
			return sentry.isAwake() && canContinueToUse();
		}
	}
}