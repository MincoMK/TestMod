package com.mincomk.testmod.common.item.items;

import com.mincomk.testmod.common.item.ModCreativeTab;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Bag extends Item {
    public Bag() {
        super(new Item.Properties().stacksTo(1).tab(ModCreativeTab.TEST_TAB));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        return super.use(level, player, hand);
    }
}
