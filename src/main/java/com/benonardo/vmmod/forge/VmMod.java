package com.benonardo.vmmod.forge;

import com.benonardo.vmmod.forge.init.VmItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("vmmod")
public class VmMod {

    public static final String MOD_ID = "vmmod";

    public VmMod() {
        MinecraftForge.EVENT_BUS.register(this);
        VmItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final ItemGroup VM_GROUP = new ItemGroup("vanillaminigames") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(VmItems.TOMATO.get());
        }
    };
}