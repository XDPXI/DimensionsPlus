package dev.xdpxi.dimensionsplus.Items;

import dev.xdpxi.dimensionsplus.Main;
import dev.xdpxi.xdlib.api.Register;
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