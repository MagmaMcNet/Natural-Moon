
package natural.silver.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import natural.silver.itemgroup.NaturalMoonItemGroup;
import natural.silver.NaturalmoonModElements;

@NaturalmoonModElements.ModElement.Tag
public class InfectedWerewolfHodeItem extends NaturalmoonModElements.ModElement {
	@ObjectHolder("naturalmoon:infected_werewolf_hode")
	public static final Item block = null;
	public InfectedWerewolfHodeItem(NaturalmoonModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NaturalMoonItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("infected_werewolf_hode");
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
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
