package net.nu11une.aiotexpanded;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;
import net.nu11une.aiotexpanded.common.optionaldeps.registry.MythicMetalsItems;
import net.nu11une.aiotexpanded.common.optionaldeps.tools.MythicMetalsBanglumAIOT;

public class AIOTExpandedClient implements ClientModInitializer {

    public AIOTExpandedClient() {
    }

    public void onInitializeClient() {
        if(AIOTExpanded.isModLoaded("mythicmetals")) {
            ModelPredicateProviderRegistry.register(MythicMetalsItems.LEGENDARY_BANGLUM_AIOT, new Identifier("is_primed"), (stack, world, entity, seed) -> MythicMetalsBanglumAIOT.getCooldown(entity, stack) ? 0.0F : 1.0F);
        }
    }
}
