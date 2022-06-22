package net.nu11une.aiotexpanded.common.optionaldeps.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nu11une.aiotexpanded.AIOTExpanded;
import org.betterx.betterend.item.material.EndToolMaterial;
import me.luligabi.basicaiots.common.item.AiotToolItem;

public class BetterEndItems {
    public static Item AETERNIUM_AIOT;
    public static Item AETERNIUM_AIOT_HEAD;
    public static Item AETERNIUM_AIOT_HANDLE;
    public static Item TERMINITE_AIOT;
    public static Item TERMINITE_AIOT_HEAD;
    public static Item TERMINITE_AIOT_HANDLE;
    public static Item THALLASIUM_AIOT;
    public static Item THALLASIUM_AIOT_HEAD;
    public static Item THALLASIUM_AIOT_HANDLE;

    public static void registerBetterEndItems() {
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "aeternium_aiot"), AETERNIUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "aeternium_aiot_head"), AETERNIUM_AIOT_HEAD);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "aeternium_aiot_handle"), AETERNIUM_AIOT_HANDLE);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "terminite_aiot"), TERMINITE_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "terminite_aiot_head"), TERMINITE_AIOT_HEAD);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "terminite_aiot_handle"), TERMINITE_AIOT_HANDLE);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "thallasium_aiot"), THALLASIUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "thallasium_aiot_head"), THALLASIUM_AIOT_HEAD);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "thallasium_aiot_handle"), THALLASIUM_AIOT_HANDLE);
    }

    static {
        AETERNIUM_AIOT = new AiotToolItem(3.5F, -2.4F, EndToolMaterial.AETERNIUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
        TERMINITE_AIOT = new AiotToolItem(3.5F, -2.4F, EndToolMaterial.TERMINITE, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        THALLASIUM_AIOT = new AiotToolItem(3.5F, -2.4F, EndToolMaterial.THALLASIUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        AETERNIUM_AIOT_HEAD = new Item(new FabricItemSettings().group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
        AETERNIUM_AIOT_HANDLE = new Item(new FabricItemSettings().group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
        TERMINITE_AIOT_HEAD = new Item(new FabricItemSettings().group(AIOTExpanded.AIOTEXPANDED_GROUP));
        TERMINITE_AIOT_HANDLE = new Item(new FabricItemSettings().group(AIOTExpanded.AIOTEXPANDED_GROUP));
        THALLASIUM_AIOT_HEAD = new Item(new FabricItemSettings().group(AIOTExpanded.AIOTEXPANDED_GROUP));
        THALLASIUM_AIOT_HANDLE = new Item(new FabricItemSettings().group(AIOTExpanded.AIOTEXPANDED_GROUP));
    }
}
