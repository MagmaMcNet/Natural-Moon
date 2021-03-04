
package natural.silver.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import natural.silver.item.HowlingicoItem;
import natural.silver.NaturalmoonModElements;

@NaturalmoonModElements.ModElement.Tag
public class NaturalMoonItemGroup extends NaturalmoonModElements.ModElement {
	public NaturalMoonItemGroup(NaturalmoonModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnatural_moon") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(HowlingicoItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
