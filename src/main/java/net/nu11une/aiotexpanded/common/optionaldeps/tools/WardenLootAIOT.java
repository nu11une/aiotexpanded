package net.nu11une.aiotexpanded.common.optionaldeps.tools;

import me.luligabi.basicaiots.common.item.AiotToolItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.nu11une.wardenloot.util.WLToolTip;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WardenLootAIOT extends AiotToolItem {
    public WardenLootAIOT(float attackDamage, float attackSpeed, ToolMaterial material, Settings settings) {
        super(attackDamage, attackSpeed, material, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 200, 1, false, false, false), attacker);
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(WLToolTip.INFLICT_DARKNESS);
    }
}
