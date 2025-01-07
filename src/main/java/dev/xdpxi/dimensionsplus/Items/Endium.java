package dev.xdpxi.dimensionsplus.Items;

import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.fiberapi.api.v4.Register;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class Endium {
    public static final Item ENDIUM = Register.registerItem(
            new Item(new Item.Settings().rarity(Rarity.COMMON)),
            "endium",
            Main.MOD_ID
    );

    public static void init() {
    }
}