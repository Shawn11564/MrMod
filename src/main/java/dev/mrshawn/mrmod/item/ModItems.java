package dev.mrshawn.mrmod.item;

import dev.mrshawn.mrmod.MrMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS
			= DeferredRegister.create(ForgeRegistries.ITEMS, MrMod.MOD_ID);

	public static final RegistryObject<Item> RAW_SAPPHIRE = register("raw_sapphire");
	public static final RegistryObject<Item> SAPPHIRE = register("sapphire");

	private static RegistryObject<Item> register(String name) {
		return register(name, new Item.Properties());
	}

	private static RegistryObject<Item> register(String name, Item.Properties properties) {
		return ITEMS.register(name, () -> new Item(properties));
	}

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}
