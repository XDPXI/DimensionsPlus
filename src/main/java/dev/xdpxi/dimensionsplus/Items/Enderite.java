package dev.xdpxi.dimensionsplus.Items;

import dev.xdpxi.dimensionsplus.Blocks.EndGrass;
import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.xdlib.api.v3.Register;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;

public class Enderite {
    public static final Block ENDERITE_ORE = Register.registerBlock(
            new Block(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.STONE)
            ),
            "enderite_ore",
            Main.MOD_ID
    );

    public static final Item ENDERITE = Register.registerItem(
            new Item(new Item.Settings()
                    .rarity(Rarity.EPIC)
            ),
            "enderite",
            Main.MOD_ID
    );

    public static void init() {
    }
}