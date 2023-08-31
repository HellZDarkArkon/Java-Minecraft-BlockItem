package com.github.hellzdarkarkon.mc.blockitem.item;

import com.github.hellzdarkarkon.mc.blockitem.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlockItem.MODID);
    public static final RegistryObject<Item> ONEYENCOIN = ITEMS.register("oneyencoin",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> TENYENCOIN = ITEMS.register("tenyencoin",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> HUNDREDYENCOIN = ITEMS.register("hundredyencoin",
            ()->new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}