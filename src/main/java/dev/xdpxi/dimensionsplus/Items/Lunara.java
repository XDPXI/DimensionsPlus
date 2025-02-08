package dev.xdpxi.dimensionsplus.Items;

import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.xdlib.api.Register;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Lunara {
    public static final Item LUNARA = Register.registerItem(
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON)),
            "lunara",
            Main.MOD_ID
    );

    public static void init() {
    }
}