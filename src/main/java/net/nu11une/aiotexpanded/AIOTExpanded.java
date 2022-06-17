package net.nu11une.aiotexpanded;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nu11une.aiotexpanded.common.optionaldeps.registry.BetterNetherItems;
import net.nu11une.aiotexpanded.core.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.loader.api.FabricLoader;
import net.nu11une.aiotexpanded.common.optionaldeps.registry.AdvancedNetheriteItems;
import net.nu11une.aiotexpanded.common.optionaldeps.registry.DragonLootItems;
import net.nu11une.aiotexpanded.common.optionaldeps.registry.BetterEndItems;
import net.nu11une.aiotexpanded.common.optionaldeps.registry.MythicMetalsItems;

public class AIOTExpanded implements ModInitializer {
	public static final String MOD_ID = "aiotexpanded";
	public static final Logger LOGGER = LoggerFactory.getLogger("AIOTs Expanded");

	public static final ItemGroup AIOTEXPANDED_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "aiotexpanded_group"),
			() -> new ItemStack(ModItems.AIOTEXPANDED_ICON));

	public static boolean isModLoaded(String modId) {
		return FabricLoader.getInstance().isModLoaded(modId);
	}

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		LOGGER.info("[" + MOD_ID + "] Registering icon");
		if(isModLoaded("advancednetherite")) {
			LOGGER.info("[" + MOD_ID + "] Detected Advanced Netherite, registering items");
			AdvancedNetheriteItems.registerAdvancedNetheriteItems();
		}
		if(isModLoaded("tempdisabled")) {
			LOGGER.info("[" + MOD_ID + "] Detected DragonLoot, registering items");
			DragonLootItems.registerDragonLootItems();
		}
		if(isModLoaded("betternether")) {
			LOGGER.info("[" + MOD_ID + "] Detected BetterNether, registering items");
			BetterNetherItems.registerBetterNetherItems();
		}
		if(isModLoaded("betterend")) {
			LOGGER.info("[" + MOD_ID + "] Detected BetterEnd, registering items");
			BetterEndItems.registerBetterEndItems();
		}
		if(isModLoaded("mythicmetals")) {
			LOGGER.info("[" + MOD_ID + "] Detected Mythic Metals, registering items");
			MythicMetalsItems.registerMythicMetalItems();
			MythicMetalsItems.initMythicMetalsAbilities();
		}
	}
}
