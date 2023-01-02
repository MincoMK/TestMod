package com.mincomk.testmod.common.item;

import com.mincomk.testmod.TestMod;
import com.mincomk.testmod.common.item.items.Bag;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> BAG = ITEMS.register("bag", () -> new Bag());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
