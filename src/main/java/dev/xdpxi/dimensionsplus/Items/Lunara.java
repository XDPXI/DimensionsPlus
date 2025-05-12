package dev.xdpxi.dimensionsplus.Items;

import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.xdlib.api.v3.Register;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Rarity;

public class Lunara {
    public static final Block LUNARA_ORE = Register.registerBlock(
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "lunara_ore",
            Main.MOD_ID
    );

    public static final Item LUNARA = Register.registerItem(
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON)),
            "lunara",
            Main.MOD_ID
    );

    public static void init() {
    }
}