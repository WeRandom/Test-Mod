package com._shadow_.tbmem.core.init;

import com._shadow_.tbmem.TestMod;
import com._shadow_.tbmem.common.block.DisplayCaseBlock;
import com._shadow_.tbmem.common.block.QuarryBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            TestMod.MOD_ID);

    public static final RegistryObject<Block> SILVER_ORE_BLOCK = BLOCKS.register("silver_ore_block",
            () -> new Block(AbstractBlock.Properties.from(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.GRAY)
                    .hardnessAndResistance(4.0F, 5F).harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .sound(SoundType.METAL)));


    public static final RegistryObject<Block> QUARRY = BLOCKS.register("quarry", () -> new QuarryBlock());
    public static final RegistryObject<Block> DISPLAY_CASE = BLOCKS.register("display_case", () -> new DisplayCaseBlock());

}
