package natural.silver.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import natural.silver.potion.StrengthofWolfsPotion;
import natural.silver.NaturalmoonModVariables;
import natural.silver.NaturalmoonModElements;

import java.util.Map;

@NaturalmoonModElements.ModElement.Tag
public class WolvesHideArmorProcedure extends NaturalmoonModElements.ModElement {
	public WolvesHideArmorProcedure(NaturalmoonModElements instance) {
		super(instance, 98);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure WolvesHideArmor!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getTotalArmorValue() : 0) > 3) && (entity instanceof PlayerEntity))) {
			if (((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NaturalmoonModVariables.PlayerVariables())).Player_NaturalMoon))
							.equals(((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_player)))) {
				if ((Math.random() < 0.2)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(StrengthofWolfsPotion.potion, (int) 65, (int) 0, (false), (false)));
				}
			} else if (((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NaturalmoonModVariables.PlayerVariables())).Player_NaturalMoon))
							.equals(((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_Werewolf)))) {
				if ((Math.random() < 0.2)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(StrengthofWolfsPotion.potion, (int) 65, (int) 1, (false), (false)));
				}
			} else if (((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new NaturalmoonModVariables.PlayerVariables())).Player_NaturalMoon))
							.equals(((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_Immune)))) {
				if ((Math.random() < 0.2)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(StrengthofWolfsPotion.potion, (int) 45, (int) 1, (false), (false)));
				}
			}
		}
	}
}
