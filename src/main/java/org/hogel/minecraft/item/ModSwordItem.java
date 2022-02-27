package org.hogel.minecraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class ModSwordItem extends SwordItem {
    public static final int DAMAGE = 1000;
    public static final float SPEED = 100.0f;
    public static final Item.Properties PROPERTIES = new Item.Properties();

    public ModSwordItem() {
        super(Tiers.NETHERITE, DAMAGE, SPEED, PROPERTIES);
    }
}
