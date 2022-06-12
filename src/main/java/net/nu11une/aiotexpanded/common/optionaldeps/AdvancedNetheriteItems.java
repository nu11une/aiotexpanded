package net.nu11une.aiotexpanded.common.optionaldeps;

import me.luligabi.basicaiots.common.item.AiotToolItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nu11une.aiotexpanded.AIOTExpanded;
import com.autovw.advancednetherite.core.ModToolTiers;

public class AdvancedNetheriteItems {
    public static Item NETHERITE_IRON_AIOT;
    public static Item NETHERITE_GOLD_AIOT;
    public static Item NETHERITE_EMERALD_AIOT;
    public static Item NETHERITE_DIAMOND_AIOT;
    public static void registerAdvancedNetheriteItems() {
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "netherite_iron_aiot"), NETHERITE_IRON_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "netherite_gold_aiot"), NETHERITE_GOLD_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "netherite_emerald_aiot"), NETHERITE_EMERALD_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "netherite_diamond_aiot"), NETHERITE_DIAMOND_AIOT);
        AIOTExpanded.LOGGER.info("Registered Advanced Netherite AIOTs for " + AIOTExpanded.MOD_ID);
    }
    static {
        NETHERITE_IRON_AIOT = new AiotToolItem(3, -2.4F, ModToolTiers.NETHERITE_IRON, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
        NETHERITE_GOLD_AIOT = new AiotToolItem(4, -2.4F, ModToolTiers.NETHERITE_GOLD, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
        NETHERITE_EMERALD_AIOT = new AiotToolItem(4, -2.4F, ModToolTiers.NETHERITE_EMERALD, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
        NETHERITE_DIAMOND_AIOT = new AiotToolItem(5, -2.4F, ModToolTiers.NETHERITE_DIAMOND, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
    }
}
