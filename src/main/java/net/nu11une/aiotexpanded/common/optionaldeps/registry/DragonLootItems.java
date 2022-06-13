package net.nu11une.aiotexpanded.common.optionaldeps.registry;

import me.luligabi.basicaiots.common.item.AiotToolItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nu11une.aiotexpanded.AIOTExpanded;
import net.dragonloot.item.DragonToolMaterial;

public class DragonLootItems {

    public static Item DRAGON_AIOT;

    public static void registerDragonLootItems(){
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "dragon_aiot"), DRAGON_AIOT);
    }

    static {
        DRAGON_AIOT = new AiotToolItem(3, -2.4F, DragonToolMaterial.getInstance(), (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
    }
}
