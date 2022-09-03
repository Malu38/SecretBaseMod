
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.malu.secretbase.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import fr.malu.secretbase.SecretBaseMod;

public class SecretBaseModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SecretBaseMod.MODID);
	public static final RegistryObject<Item> VANISHING_BLOCK = block(SecretBaseModBlocks.VANISHING_BLOCK, SecretBaseModTabs.TAB_SECRET_BASE_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
