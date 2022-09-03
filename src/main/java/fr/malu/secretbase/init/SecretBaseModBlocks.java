
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.malu.secretbase.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import fr.malu.secretbase.block.VanishingBlockBlock;
import fr.malu.secretbase.SecretBaseMod;

public class SecretBaseModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SecretBaseMod.MODID);
	public static final RegistryObject<Block> VANISHING_BLOCK = REGISTRY.register("vanishing_block", () -> new VanishingBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			VanishingBlockBlock.registerRenderLayer();
		}
	}
}
