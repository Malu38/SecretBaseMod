
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.malu.secretbase.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SecretBaseModTabs {
	public static CreativeModeTab TAB_SECRET_BASE_TAB;

	public static void load() {
		TAB_SECRET_BASE_TAB = new CreativeModeTab("tabsecret_base_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SecretBaseModBlocks.VANISHING_BLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
