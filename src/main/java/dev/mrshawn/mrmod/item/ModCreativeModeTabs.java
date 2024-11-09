package dev.mrshawn.mrmod.item;

import dev.mrshawn.mrmod.MrMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS
			= DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MrMod.MOD_ID);

	public static final RegistryObject<CreativeModeTab> MRMOD_TAB = CREATIVE_MODE_TABS.register("mrmod_tab",
			() -> CreativeModeTab.builder()
					.icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
					.title(Component.translatable("creativetab.mrmod_tab"))
					.displayItems((parameters, output) -> {
						output.accept(ModItems.RAW_SAPPHIRE.get());
						output.accept(ModItems.SAPPHIRE.get());
					})
					.build()
	);

	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TABS.register(eventBus);
	}

}
