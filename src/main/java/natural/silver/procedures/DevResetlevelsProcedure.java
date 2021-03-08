package natural.silver.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import natural.silver.NaturalmoonModVariables;
import natural.silver.NaturalmoonModElements;

import java.util.Map;

@NaturalmoonModElements.ModElement.Tag
public class DevResetlevelsProcedure extends NaturalmoonModElements.ModElement {
	public DevResetlevelsProcedure(NaturalmoonModElements instance) {
		super(instance, 107);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure DevResetlevels!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure DevResetlevels!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		NaturalmoonModVariables.MapVariables.get(world).max_level = (double) 20;
		NaturalmoonModVariables.MapVariables.get(world).syncData(world);
		{
			double _setval = (double) 1;
			entity.getCapability(NaturalmoonModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Level = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
