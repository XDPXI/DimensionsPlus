package dev.xdpxi.dimensionsplus.Blocks;

import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.fiberapi.api.v4.Register;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class EndGrass {
    public static final Block END_GRASS = Register.registerBlock(
        new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
        "end_grass",
        true,
        Main.MOD_ID
    );

    public static void init() {
    }
}