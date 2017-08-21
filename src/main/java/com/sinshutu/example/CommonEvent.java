package com.sinshutu.example;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonEvent {
    public CommonEvent(){
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void onEntityItemPickupEvent(EntityItemPickupEvent event)
    {
        String msg = "EntityItemPickupEvent";
        event.getEntityPlayer().sendMessage(new TextComponentString(msg));
    }
}
