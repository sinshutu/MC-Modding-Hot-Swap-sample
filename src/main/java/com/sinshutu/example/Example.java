package com.sinshutu.example;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Example.MODID, version = Example.VERSION)
public class Example
{
    public static final String MODID = "mc-modding-hot-swap-sample";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event){
        System.out.println("OUT:::DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
        MinecraftForge.EVENT_BUS.register(new CommonEvent());
    }
}
