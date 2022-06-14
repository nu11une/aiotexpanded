package net.nu11une.aiotexpanded.common.optionaldeps.tools;

import draylar.magna.api.BlockFinder;
import draylar.magna.api.BreakValidator;
import io.wispforest.owo.ops.WorldOps;
import java.util.List;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import nourl.mythicmetals.utils.MythicParticleSystem;
import me.luligabi.basicaiots.common.item.AiotToolItem;
import net.minecraft.tag.BlockTags;
import net.minecraft.block.Blocks;

public class MythicMetalsBanglumAIOT extends AiotToolItem implements BreakValidator {

    public MythicMetalsBanglumAIOT(float attackDamage, float attackSpeed, ToolMaterial material, Settings settings) {
        super(attackDamage, attackSpeed, material, settings);
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        boolean shouldPass = false;
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        if (player != null && !getCooldown(player, context.getStack()) && !world.isClient) {
            List<BlockPos> finder = BlockFinder.DEFAULT.findPositions(world, player, 1, 5);

            for (BlockPos blockPos : finder) {
                if(world.getBlockState(blockPos).isIn(BlockTags.PICKAXE_MINEABLE) ||
                        world.getBlockState(blockPos).isIn(BlockTags.SHOVEL_MINEABLE) ||
                        world.getBlockState(blockPos).isIn(BlockTags.AXE_MINEABLE) ||
                        world.getBlockState(blockPos).isIn(BlockTags.HOE_MINEABLE) ||
                        world.getBlockState(blockPos).isOf(Blocks.COBWEB)){
                    world.breakBlock(blockPos, true, player);
                    context.getStack().damage(2, player, (e) -> {
                        e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
                    });
                    shouldPass = true;
                }
            }
        }

        if (shouldPass) {
            BlockPos pos = context.getBlockPos();
            MythicParticleSystem.OVERENGINEERED_SINGLE_EXPLOSION_PARTICLE.spawn(world, Vec3d.of(pos));
            WorldOps.playSound(world, pos, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.PLAYERS);
            player.getItemCooldownManager().set(this, 75);
            return ActionResult.SUCCESS;
        } else {
            return ActionResult.FAIL;
        }
    }

    public boolean canBreak(BlockView view, BlockPos pos) {
        return super.isSuitableFor(view.getBlockState(pos));
    }

    public static boolean getCooldown(LivingEntity entity, ItemStack stack) {
        return entity != null && entity.isPlayer() ? ((PlayerEntity)entity).getItemCooldownManager().isCoolingDown(stack.getItem()) : false;
    }
}
