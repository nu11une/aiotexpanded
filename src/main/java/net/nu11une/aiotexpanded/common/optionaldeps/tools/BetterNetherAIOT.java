package net.nu11une.aiotexpanded.common.optionaldeps.tools;

import me.luligabi.basicaiots.common.item.AiotToolItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import org.betterx.betternether.items.materials.BNToolMaterial;
import org.betterx.betternether.registry.NetherEnchantments;
import org.betterx.betternether.interfaces.InitialStackStateProvider;
import java.util.HashMap;
import java.util.Map;

public class BetterNetherAIOT extends AiotToolItem implements InitialStackStateProvider {

    public BetterNetherAIOT(float attackDamage, float attackSpeed, ToolMaterial material, Settings settings) {
        super(attackDamage, attackSpeed, material, settings);
    }

    public void initializeState(ItemStack stack) {
        Map<Enchantment, Integer> defaultEnchants = new HashMap();
        int obsidianLevel = 0;
        if (this.getMaterial() == BNToolMaterial.CINCINNASITE_DIAMOND) {
            obsidianLevel = 3;
        } else if (this.getMaterial() == BNToolMaterial.NETHER_RUBY) {
            obsidianLevel = 2;
            defaultEnchants.put(NetherEnchantments.RUBY_FIRE, 1);
        }

        if (obsidianLevel > 0) {
            defaultEnchants.put(NetherEnchantments.OBSIDIAN_BREAKER, Integer.valueOf(obsidianLevel));
            EnchantmentHelper.set(defaultEnchants, stack);
        }

    }
}
