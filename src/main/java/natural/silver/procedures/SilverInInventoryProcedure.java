package natural.silver.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import natural.silver.NaturalmoonModVariables;
import natural.silver.NaturalmoonModElements;

import java.util.Map;

@NaturalmoonModElements.ModElement.Tag
public class SilverInInventoryProcedure extends NaturalmoonModElements.ModElement {
	public SilverInInventoryProcedure(NaturalmoonModElements instance) {
		super(instance, 41);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SilverInInventory!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new NaturalmoonModVariables.PlayerVariables())).Player_NaturalMoon))
						.equals(((entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NaturalmoonModVariables.PlayerVariables())).Natural_Werewolf)))) {
			if ((Math.random() < 0.01)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, (int) 10, (int) 0, (false), (false)));
			}
		}
	}
}
