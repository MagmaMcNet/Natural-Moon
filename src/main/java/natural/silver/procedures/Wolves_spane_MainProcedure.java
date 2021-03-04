package natural.silver.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import natural.silver.NaturalmoonModVariables;
import natural.silver.NaturalmoonModElements;

import java.util.Map;

@NaturalmoonModElements.ModElement.Tag
public class Wolves_spane_MainProcedure extends NaturalmoonModElements.ModElement {
	public Wolves_spane_MainProcedure(NaturalmoonModElements instance) {
		super(instance, 39);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Wolves_spane_Main!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NaturalmoonModVariables.PlayerVariables())).Player_NaturalMoon))
						.equals(((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_Werewolf)))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 30, (int) 1, (false), (false)));
		} else if (((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NaturalmoonModVariables.PlayerVariables())).Player_NaturalMoon))
						.equals(((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_Immune)))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 40, (int) 1, (false), (false)));
		}
	}
}
