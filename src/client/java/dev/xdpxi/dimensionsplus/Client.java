package dev.xdpxi.dimensionsplus;

import dev.xdpxi.dimensionsplus.Util.Log;
import net.fabricmc.api.ClientModInitializer;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Log.info("[DimensionsPlus/Client] - Initializing...");

        Log.info("[DimensionsPlus/Client] - Initialized!");
    }
}