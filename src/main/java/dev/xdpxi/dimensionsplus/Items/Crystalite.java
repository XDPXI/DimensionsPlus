package dev.xdpxi.dimensionsplus.Items;

import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.fiberapi.api.v4.Register;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Crystalite {
    public static final Item CRYSTALITE = Register.registerItem(
            new Item(new Item.Settings().rarity(Rarity.RARE)),
            "crystalite",
            Main.MOD_ID
    );

    public static void init() {
    }
}