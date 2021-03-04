package natural.silver.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import natural.silver.NaturalmoonModElements;

import java.util.Map;

@NaturalmoonModElements.ModElement.Tag
public class SilverCrossBowBulletHitsPlayerProcedure extends NaturalmoonModElements.ModElement {
	public SilverCrossBowBulletHitsPlayerProcedure(NaturalmoonModElements instance) {
		super(instance, 86);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SilverCrossBowBulletHitsPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 4);
	}
}
