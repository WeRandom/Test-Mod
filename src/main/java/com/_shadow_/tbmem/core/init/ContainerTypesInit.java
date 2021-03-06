package com._shadow_.tbmem.core.init;

import com._shadow_.tbmem.TestMod;
import com._shadow_.tbmem.common.container.DisplayCaseContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypesInit {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPE = DeferredRegister
            .create(ForgeRegistries.CONTAINERS, TestMod.MOD_ID);

    public static final RegistryObject<ContainerType<DisplayCaseContainer>> DISPLAY_CASE_CONTAINER_TYPE = CONTAINER_TYPE
            .register("display_case", () -> IForgeContainerType.create(DisplayCaseContainer::new));
}
