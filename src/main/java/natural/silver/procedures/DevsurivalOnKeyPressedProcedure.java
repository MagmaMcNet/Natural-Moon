package natural.silver.procedures;

import net.minecraft.world.GameType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import natural.silver.NaturalmoonModElements;

import java.util.Map;

@NaturalmoonModElements.ModElement.Tag
public class DevsurivalOnKeyPressedProcedure extends NaturalmoonModElements.ModElement {
	public DevsurivalOnKeyPressedProcedure(NaturalmoonModElements instance) {
		super(instance, 70);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure DevsurivalOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.hasPermissionLevel((int) 4))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).setGameType(GameType.SURVIVAL);
		}
	}
}
