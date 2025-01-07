package dev.xdpxi.dimensionsplus.Items;

import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.fiberapi.api.v4.Register;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Lunara {
    public static final Item lunara = Register.registerItem(
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON)),
            "lunara",
            Main.MOD_ID
    );

    public static void init() {
    }
}