package dev.xdpxi.dimensionsplus.Items;

import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.fiberapi.api.v4.Register;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Enderite {
    public static final Item ENDERITE = Register.registerItem(
            new Item(new Item.Settings().rarity(Rarity.EPIC)),
            "enderite",
            Main.MOD_ID
    );

    public static void init() {
    }
}