package com.mincomk.testmod.common.screen;

import com.mincomk.testmod.TestMod;
import com.mincomk.testmod.common.block.entity.GemInfusingStationBlockEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TestMod.MODID);

    public static final RegistryObject<MenuType<GemInfusingStationMenu>> GEM_INFUSING_STATION_MENU = registerMenuType((int id, Inventory inv, FriendlyByteBuf extraData) -> {
        BlockEntity blockEntity = inv.player.level.getBlockEntity(extraData.readBlockPos());
        GemInfusingStationBlockEntity gBlockEntity = (GemInfusingStationBlockEntity) blockEntity;
        return new GemInfusingStationMenu(id, inv, blockEntity, gBlockEntity.data);
    }, "gem_infusing_station_menu");

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
