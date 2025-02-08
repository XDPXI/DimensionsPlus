package dev.xdpxi.dimensionsplus.Blocks;

import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.xdlib.api.v3.Register;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class EndGrass {
    public static final Block END_GRASS = Register.registerBlock(
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
        "end_grass",
        Main.MOD_ID
    );

    public static void init() {
    }
}