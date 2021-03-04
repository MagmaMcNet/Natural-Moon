package natural.silver.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import natural.silver.NaturalmoonModVariables;
import natural.silver.NaturalmoonModElements;

import java.util.Map;

@NaturalmoonModElements.ModElement.Tag
public class InfectedwolvesspanepotionEatenProcedure extends NaturalmoonModElements.ModElement {
	public InfectedwolvesspanepotionEatenProcedure(NaturalmoonModElements instance) {
		super(instance, 85);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure InfectedwolvesspanepotionEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure InfectedwolvesspanepotionEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NaturalmoonModVariables.PlayerVariables())).Player_NaturalMoon))
						.equals(((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_Immune)))) {
			{
				double _setval = (double) (((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) + 1);
				entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 400, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 200, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 123, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 150, (int) 1, (false), (false)));
		} else if (((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NaturalmoonModVariables.PlayerVariables())).Player_NaturalMoon))
						.equals(((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_player)))) {
			{
				String _setval = (String) ((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_Werewolf);
				entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Player_NaturalMoon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("The moon starts.."), (true));
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 230, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 150, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 300, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 200, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 400, (int) 0, (false), (false)));
		} else if ((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) > (NaturalmoonModVariables.MapVariables.get(world).max_level))) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("you are Max Level"), (true));
			}
			{
				double _setval = (double) (NaturalmoonModVariables.MapVariables.get(world).max_level);
				entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NaturalmoonModVariables.PlayerVariables())).Player_NaturalMoon))
						.equals(((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_Werewolf)))) {
			{
				double _setval = (double) (((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NaturalmoonModVariables.PlayerVariables())).Level) + 1);
				entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 230, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 300, (int) 0, (false), (false)));
		}
	}
}
