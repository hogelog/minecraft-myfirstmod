package org.hogel.minecraft.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import java.util.List;

public class ModPickaxeItem extends DiggerItem {
    public static final float DAMAGE = 1000f;
    public static final float SPEED = 100f;
    public static final Item.Properties PROPERTIES = new Item.Properties();

    private static final List<ToolAction> ACTIONS;
    static {
        ACTIONS = List.of(ToolActions.AXE_DIG, ToolActions.SHOVEL_DIG, ToolActions.PICKAXE_DIG);
    }

    public ModPickaxeItem() {
        super(DAMAGE, SPEED, Tiers.NETHERITE, BlockTags.MINEABLE_WITH_PICKAXE, PROPERTIES);
    }

    @Override
    public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
        return ACTIONS.contains(toolAction);
    }
}
