package net.nu11une.aiotexpanded.common.optionaldeps.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nu11une.aiotexpanded.AIOTExpanded;
import net.nu11une.aiotexpanded.common.optionaldeps.materials.WardenLootMaterial;
import net.nu11une.aiotexpanded.common.optionaldeps.tools.WardenLootAIOT;

public class WardenLootItems {
    public static WardenLootAIOT SCULK_AIOT;

    public static void registerWardenLootItems() {
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "sculk_aiot"), SCULK_AIOT);
    }

    static {
        SCULK_AIOT = new WardenLootAIOT(3, -2.4F, WardenLootMaterial.SCULKERITE, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
    }
}
