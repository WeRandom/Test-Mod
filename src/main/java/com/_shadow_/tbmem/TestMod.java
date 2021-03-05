package com._shadow_.tbmem;


import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("tbmem")
public class TestMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tbmem";

    public TestMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }

}
