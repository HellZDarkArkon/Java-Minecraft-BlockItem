package com.github.hellzdarkarkon.mc.blockitem;

import com.github.hellzdarkarkon.mc.blockitem.block.ModBlocks;
import com.github.hellzdarkarkon.mc.blockitem.item.ModItems;
import com.google.common.eventbus.Subscribe;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import static com.github.hellzdarkarkon.mc.blockitem.BlockItem.*;

@Mod(BlockItem.MODID)
public class BlockItem {
    public static final String MODID = "blockitem";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BlockItem() {
        IEventBus modEB = FMLJavaModLoadingContext.get().getModEventBus();
        com.github.hellzdarkarkon.mc.blockitem.item.CreativeModeTabs.register(modEB);
        ModItems.register(modEB);
        ModBlocks.register(modEB);
        modEB.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEB.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent ev) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent ev) {
        
    }

    @SubscribeEvent
    public void onServerStart(ServerStartingEvent ev) {
    }


    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent ev) {
        }
    }

}