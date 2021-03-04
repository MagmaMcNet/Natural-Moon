
package natural.silver.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import natural.silver.itemgroup.NaturalMoonItemGroup;
import natural.silver.NaturalmoonModElements;

@NaturalmoonModElements.ModElement.Tag
public class DriedWerewolfhideItem extends NaturalmoonModElements.ModElement {
	@ObjectHolder("naturalmoon:dried_werewolfhide")
	public static final Item block = null;
	public DriedWerewolfhideItem(NaturalmoonModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NaturalMoonItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("dried_werewolfhide");
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
	}
}
