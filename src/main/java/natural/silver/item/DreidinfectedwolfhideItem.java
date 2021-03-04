
package natural.silver.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import natural.silver.itemgroup.NaturalMoonItemGroup;
import natural.silver.NaturalmoonModElements;

@NaturalmoonModElements.ModElement.Tag
public class DreidinfectedwolfhideItem extends NaturalmoonModElements.ModElement {
	@ObjectHolder("naturalmoon:dreidinfectedwolfhide")
	public static final Item block = null;
	public DreidinfectedwolfhideItem(NaturalmoonModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NaturalMoonItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("dreidinfectedwolfhide");
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
