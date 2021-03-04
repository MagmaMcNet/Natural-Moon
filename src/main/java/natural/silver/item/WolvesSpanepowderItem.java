
package natural.silver.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import natural.silver.itemgroup.NaturalMoonItemGroup;
import natural.silver.NaturalmoonModElements;

@NaturalmoonModElements.ModElement.Tag
public class WolvesSpanepowderItem extends NaturalmoonModElements.ModElement {
	@ObjectHolder("naturalmoon:wolves_spanepowder")
	public static final Item block = null;
	public WolvesSpanepowderItem(NaturalmoonModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NaturalMoonItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("wolves_spanepowder");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 1;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
