package dev.xdpxi.dimensionsplus;

import dev.xdpxi.dimensionsplus.Blocks.EndGrass;
import dev.xdpxi.dimensionsplus.Items.Crystalite;
import dev.xdpxi.dimensionsplus.Items.Enderite;
import dev.xdpxi.dimensionsplus.Items.Endium;
import dev.xdpxi.dimensionsplus.Items.Lunara;
import dev.xdpxi.dimensionsplus.Utilities.Log;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import static dev.xdpxi.dimensionsplus.ItemGroup.CUSTOM_ITEM_GROUP_KEY;

public class Main implements ModInitializer {
    public static final String MOD_ID = "dimensionsplus";

    @Override
    public void onInitialize() {
        Log.info("[DimensionsPlus/Main] - Initializing...");

        Log.info("[DimensionsPlus/Register] - Registering Item Group...");
        ItemGroup.init(); // Item Group

        Log.info("[DimensionsPlus/Register] - Registering Items...");
        Enderite.init(); // Netherite
        Crystalite.init(); // Diamond
        Lunara.init(); // Gold
        Endium.init(); // Iron

        Log.info("[DimensionsPlus/Register] - Registering Blocks...");
        EndGrass.init(); // Grass

        Log.info("[DimensionsPlus/ItemGroup] - Adding Items & Blocks to Item Group...");
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(EndGrass.END_GRASS);
            itemGroup.add(Crystalite.CRYSTALITE);
            itemGroup.add(Crystalite.CRYSTALITE_ORE);
            itemGroup.add(Enderite.ENDERITE);
            itemGroup.add(Enderite.ENDERITE_ORE);
            itemGroup.add(Lunara.LUNARA);
            itemGroup.add(Lunara.LUNARA_ORE);
            itemGroup.add(Endium.ENDIUM);
            itemGroup.add(Endium.ENDIUM_ORE);
        });

        Log.info("[DimensionsPlus/Main] - Initialized!");
    }
}