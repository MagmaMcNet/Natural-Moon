package natural.silver.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;

import natural.silver.NaturalmoonModElements;

import java.util.Map;

@NaturalmoonModElements.ModElement.Tag
public class SilverCrossBowWhileBulletFlyingTickProcedure extends NaturalmoonModElements.ModElement {
	public SilverCrossBowWhileBulletFlyingTickProcedure(NaturalmoonModElements instance) {
		super(instance, 90);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure SilverCrossBowWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure SilverCrossBowWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure SilverCrossBowWhileBulletFlyingTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure SilverCrossBowWhileBulletFlyingTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.addParticle(ParticleTypes.DRAGON_BREATH, x, y, z, 0, 1, 0);
		world.addParticle(ParticleTypes.DRAGON_BREATH, x, y, z, 1, 0, 0);
		world.addParticle(ParticleTypes.DRAGON_BREATH, x, y, z, 0, 0, 1);
	}
}
