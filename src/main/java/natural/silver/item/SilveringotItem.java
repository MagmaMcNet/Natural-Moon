
package natural.silver.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import natural.silver.procedures.Silver_toolsProcedure;
import natural.silver.procedures.SilverInInventoryProcedure;
import natural.silver.itemgroup.NaturalMoonItemGroup;
import natural.silver.NaturalmoonModElements;

import java.util.Map;
import java.util.HashMap;

@NaturalmoonModElements.ModElement.Tag
public class SilveringotItem extends NaturalmoonModElements.ModElement {
	@ObjectHolder("naturalmoon:silveringot")
	public static final Item block = null;
	public SilveringotItem(NaturalmoonModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NaturalMoonItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("silveringot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
			boolean retval = super.hitEntity(itemstack, entity, sourceentity);
			double x = entity.posX;
			double y = entity.posY;
			double z = entity.posZ;
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Silver_toolsProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}

		@Override
		public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
			boolean retval = super.onEntitySwing(itemstack, entity);
			double x = entity.posX;
			double y = entity.posY;
			double z = entity.posZ;
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Silver_toolsProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.posX;
			double y = entity.posY;
			double z = entity.posZ;
			if (selected) {
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				Silver_toolsProcedure.executeProcedure($_dependencies);
			}
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SilverInInventoryProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
