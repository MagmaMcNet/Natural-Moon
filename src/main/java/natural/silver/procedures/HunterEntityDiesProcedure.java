package natural.silver.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import natural.silver.item.WolvesSpanepowderItem;
import natural.silver.item.SilvercrossbowboltItem;
import natural.silver.item.SilverCrossBowItem;
import natural.silver.item.NaturalMoon_SilverSwordItem;
import natural.silver.block.WolvesSpaneBlock;
import natural.silver.NaturalmoonModElements;

import java.util.Map;

@NaturalmoonModElements.ModElement.Tag
public class HunterEntityDiesProcedure extends NaturalmoonModElements.ModElement {
	public HunterEntityDiesProcedure(NaturalmoonModElements instance) {
		super(instance, 94);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure HunterEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure HunterEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure HunterEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure HunterEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() < 0.2)) {
			if (world instanceof World && !world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), (x + 0.5), y, (z + 0.5),
						new ItemStack(SilvercrossbowboltItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
			if (world instanceof World && !world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), (x + 0.5), y, (z + 0.5),
						new ItemStack(SilvercrossbowboltItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else if ((Math.random() < 0.2)) {
			if (world instanceof World && !world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), (x + 0.5), y, (z + 0.5),
						new ItemStack(SilverCrossBowItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else if ((Math.random() < 0.2)) {
			if (world instanceof World && !world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), (x + 0.5), y, (z + 0.5),
						new ItemStack(NaturalMoon_SilverSwordItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else if ((Math.random() < 0.2)) {
			if (world instanceof World && !world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), (x + 0.5), y, (z + 0.5),
						new ItemStack(WolvesSpaneBlock.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else if ((Math.random() < 0.2)) {
			if (world instanceof World && !world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), (x + 0.5), y, (z + 0.5),
						new ItemStack(WolvesSpanepowderItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
