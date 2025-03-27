package dev.xdpxi.dimensionsplus.Items;

import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.xdlib.api.v5.Register;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;

public class Lunara {
    public static final Block LUNARA_ORE = Register.registerBlock(
            Block::new,
            AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE),
            true,
            "lunara_ore",
            Main.MOD_ID
    );

    public static final Item LUNARA = Register.registerItem(
            Item::new,
            new Item.Settings().rarity(Rarity.UNCOMMON),
            "lunara",
            Main.MOD_ID
    );

    public static void init() {
    }
}