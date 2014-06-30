package com.example.exampleaddon;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.util.ChatComponentText;

import org.obsidianbox.magma.addon.Addon;

public class ExampleAddon extends Addon {
    // This method is basically the 'My addon was just turned on' method.
    @Override
    public void onInitialize() {
        // We register this class in the FMLCommandHandler bus as we have a FML event here
        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        event.player.addChatMessage(new ChatComponentText("My first addon, woo!"));
    }
}
