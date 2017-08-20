package com.sinshutu.example;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Example.MODID, version = Example.VERSION)
public class Example
{
    public static final String MODID = "mc-modding-hot-swap-sample";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
