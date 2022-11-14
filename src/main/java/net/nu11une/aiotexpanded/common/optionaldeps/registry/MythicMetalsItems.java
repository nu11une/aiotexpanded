package net.nu11une.aiotexpanded.common.optionaldeps.registry;

import me.luligabi.basicaiots.common.item.AiotToolItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.text.Style;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.nu11une.aiotexpanded.AIOTExpanded;
import nourl.mythicmetals.abilities.Abilities;
import nourl.mythicmetals.tools.MythicToolMaterials;
import net.nu11une.aiotexpanded.common.optionaldeps.tools.MythicMetalsBanglumAIOT;

public class MythicMetalsItems {

    public static Item ADAMANTITE_AIOT;
    public static Item AQUARIUM_AIOT;
    public static Item BANGLUM_AIOT;
    public static Item BRONZE_AIOT;
    public static Item CARMOT_AIOT;
    public static Item CELESTIUM_AIOT;
    public static Item COPPER_AIOT;
    public static Item DURASTEEL_AIOT;
    public static Item HALLOWED_AIOT;
    public static Item KYBER_AIOT;
    public static Item LEGENDARY_BANGLUM_AIOT;
    public static Item METALLURGIUM_AIOT;
    public static Item MYTHRIL_AIOT;
    public static Item ORICHALCUM_AIOT;
    public static Item OSMIUM_AIOT;
    public static Item PALLADIUM_AIOT;
    public static Item PROMETHEUM_AIOT;
    public static Item QUADRILLUM_AIOT;
    public static Item RUNITE_AIOT;
    public static Item STAR_PLATINUM_AIOT;
    public static Item STORMYX_AIOT;



    public static void registerMythicMetalItems(){
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "adamantite_aiot"), ADAMANTITE_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "aquarium_aiot"), AQUARIUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "banglum_aiot"), BANGLUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "bronze_aiot"), BRONZE_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "carmot_aiot"), CARMOT_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "celestium_aiot"), CELESTIUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "copper_aiot"), COPPER_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "durasteel_aiot"), DURASTEEL_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "hallowed_aiot"), HALLOWED_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "kyber_aiot"), KYBER_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "legendary_banglum_aiot"), LEGENDARY_BANGLUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "metallurgium_aiot"), METALLURGIUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "mythril_aiot"), MYTHRIL_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "orichalcum_aiot"), ORICHALCUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "osmium_aiot"), OSMIUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "palladium_aiot"), PALLADIUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "prometheum_aiot"), PROMETHEUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "quadrillum_aiot"), QUADRILLUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "runite_aiot"), RUNITE_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "star_platinum_aiot"), STAR_PLATINUM_AIOT);
        Registry.register(Registry.ITEM, new Identifier(AIOTExpanded.MOD_ID, "stormyx_aiot"), STORMYX_AIOT);

    }

    public static void initMythicMetalsAbilities() {
        Abilities.AQUA_AFFINITY.addItem(MythicMetalsItems.AQUARIUM_AIOT, Style.EMPTY.withColor(Formatting.AQUA));
        Abilities.BLAST_MINING.addItem(MythicMetalsItems.LEGENDARY_BANGLUM_AIOT, Style.EMPTY.withColor(Formatting.GOLD));
        Abilities.KNOCKBACK.addItem(MythicMetalsItems.LEGENDARY_BANGLUM_AIOT, Style.EMPTY.withColor(Formatting.GOLD));
        Abilities.MENDING.addItem(MythicMetalsItems.PROMETHEUM_AIOT, Style.EMPTY.withColor(3828310));
    }

    static {
        ADAMANTITE_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.ADAMANTITE, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        AQUARIUM_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.AQUARIUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        BANGLUM_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.BANGLUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        BRONZE_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.BRONZE, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        CARMOT_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.CARMOT, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        CELESTIUM_AIOT = new AiotToolItem(3, -2.1F, MythicToolMaterials.CELESTIUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).rarity(Rarity.RARE));
        COPPER_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.COPPER, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        DURASTEEL_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.DURASTEEL, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        HALLOWED_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.HALLOWED, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).rarity(Rarity.UNCOMMON));
        KYBER_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.KYBER, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        LEGENDARY_BANGLUM_AIOT = new MythicMetalsBanglumAIOT(3, -2.5F, MythicToolMaterials.LEGENDARY_BANGLUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).rarity(Rarity.UNCOMMON));
        METALLURGIUM_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.METALLURGIUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof().rarity(Rarity.RARE));
        MYTHRIL_AIOT = new AiotToolItem(3, -2.2F, MythicToolMaterials.MYTHRIL, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        ORICHALCUM_AIOT = new AiotToolItem(3, -2.5F, MythicToolMaterials.ORICHALCUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        OSMIUM_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.OSMIUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        PALLADIUM_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.PALLADIUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP).fireproof());
        PROMETHEUM_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.PROMETHEUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        QUADRILLUM_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.QUADRILLUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        RUNITE_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.RUNITE, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        STAR_PLATINUM_AIOT = new AiotToolItem(3, -2.2F, MythicToolMaterials.STAR_PLATINUM, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
        STORMYX_AIOT = new AiotToolItem(3, -2.4F, MythicToolMaterials.STORMYX, (new FabricItemSettings()).group(AIOTExpanded.AIOTEXPANDED_GROUP));
    }
}
