package com.github.hellzdarkarkon.mc.blockitem.item;

import com.github.hellzdarkarkon.mc.blockitem.BlockItem;
import com.github.hellzdarkarkon.mc.blockitem.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockItem.MODID);
    public static final RegistryObject<CreativeModeTab> MOD_TAB =
            CREATIVE_TABS.register("mod_tab",
                    ()->CreativeModeTab.builder().icon(()->new ItemStack(ModItems.HUNDREDYENCOIN.get()))
                            .title(Component.translatable("creativetab.mod_tab"))
                            .displayItems((pParameters, pOutput)->{
                                pOutput.accept(ModItems.ONEYENCOIN.get());
                                pOutput.accept(ModItems.TENYENCOIN.get());
                                pOutput.accept(ModItems.HUNDREDYENCOIN.get());

                                pOutput.accept(ModBlocks.YENBLOCK.get());
                            })
                            .build());
    public static void register(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }
}