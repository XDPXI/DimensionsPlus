package dev.xdpxi.dimensionsplus;

import dev.xdpxi.dimensionsplus.Items.Crystalite;
import dev.xdpxi.dimensionsplus.Items.Enderite;
import dev.xdpxi.dimensionsplus.Items.Endium;
import dev.xdpxi.dimensionsplus.Items.Lunara;
import dev.xdpxi.xdlib.Logger;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
    public static final String MOD_ID = "dimensionsplus";

    @Override
    public void onInitialize() {
        Enderite.init(); // Netherite
        Crystalite.init(); // Diamond
        Lunara.init(); // Gold
        Endium.init(); // Iron
    }
}