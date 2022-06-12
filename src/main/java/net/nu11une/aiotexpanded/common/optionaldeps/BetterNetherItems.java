package net.nu11une.aiotexpanded.common.optionaldeps;

import paulevs.betternether.items.materials.BNToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nu11une.aiotexpanded.AIOTExpanded;

public class BetterNetherItems {
    public static Item NETHER_RUBY_AIOT;
    public static Item CINCINNASITE_AIOT;
    public static Item CINCINNASITE_DIAMOND_AIOT;

    public static void registerBetterNetherItems(){
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "nether_ruby_aiot"), NETHER_RUBY_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "cincinnasite_aiot"), CINCINNASITE_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "cincinnasite_diamond_aiot"), CINCINNASITE_DIAMOND_AIOT);
    }

    static {
        NETHER_RUBY_AIOT = new BetterNetherAIOT(3, -2.4F, BNToolMaterial.NETHER_RUBY, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
        CINCINNASITE_AIOT = new BetterNetherAIOT(3, -2.4F, BNToolMaterial.CINCINNASITE, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
        CINCINNASITE_DIAMOND_AIOT = new BetterNetherAIOT(3, -2.4F, BNToolMaterial.CINCINNASITE_DIAMOND, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
    }
}
