package net.nu11une.aiotexpanded.core;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nu11une.aiotexpanded.AIOTExpanded;

public class ModItems {
    public static Item AIOTEXPANDED_ICON;

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "aiotexpanded_icon"), AIOTEXPANDED_ICON);
    }

    static {
        AIOTEXPANDED_ICON = new Item(new FabricItemSettings());
    }

}
