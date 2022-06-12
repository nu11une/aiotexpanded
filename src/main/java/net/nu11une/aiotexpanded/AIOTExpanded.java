package net.nu11une.aiotexpanded;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nu11une.aiotexpanded.core.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.loader.api.FabricLoader;
import net.nu11une.aiotexpanded.common.optionaldeps.AdvancedNetheriteItems;

public class AIOTExpanded implements ModInitializer {
	public static final String MOD_ID = "aiotexpanded";
	public static final Logger LOGGER = LoggerFactory.getLogger("AIOTs Expanded");

	public static final ItemGroup AIOTEXPANDED_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "aiotexpanded_group"),
			() -> new ItemStack(ModItems.AIOTEXPANDED_ICON));

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		LOGGER.info("Registered items");
		if(FabricLoader.getInstance().isModLoaded("advancednetherite")) {
			LOGGER.info("Detected Advanced Netherite, registering items");
			AdvancedNetheriteItems.registerAdvancedNetheriteItems();
		}
	}
}
