package dev.xdpxi.dimensionsplus.Blocks;

import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.xdlib.api.v5.Register;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class EndGrass {
    public static final Block END_GRASS = Register.registerBlock(
            Block::new,
            AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE),
            true,
            "end_grass",
            Main.MOD_ID
    );

    public static void init() {
    }
}