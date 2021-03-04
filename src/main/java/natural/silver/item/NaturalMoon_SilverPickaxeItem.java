
package natural.silver.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import natural.silver.procedures.Silver_toolsProcedure;
import natural.silver.procedures.SilverInInventoryProcedure;
import natural.silver.itemgroup.NaturalMoonItemGroup;
import natural.silver.NaturalmoonModElements;

import java.util.Map;
import java.util.HashMap;

@NaturalmoonModElements.ModElement.Tag
public class NaturalMoon_SilverPickaxeItem extends NaturalmoonModElements.ModElement {
	@ObjectHolder("naturalmoon:natural_moon_silver_pickaxe")
	public static final Item block = null;
	public NaturalMoon_SilverPickaxeItem(NaturalmoonModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SilveringotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(NaturalMoonItemGroup.tab)) {
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
		}.setRegistryName("natural_moon_silver_pickaxe"));
	}
}
