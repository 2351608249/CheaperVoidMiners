package com.jdz.vmd.common.loaders;

import gregtech.api.enums.ItemList;
import gregtech.api.util.GTModHandler;

public class RecipeLoader {

    public static void run() {
        GTModHandler
            .addShapelessCraftingRecipe(ItemRegistry.VoidMinerEX1, new Object[] { ItemList.Machine_LV_Miner.get(1) });
        GTModHandler
            .addShapelessCraftingRecipe(ItemRegistry.VoidMinerEX2, new Object[] { ItemList.Machine_HV_Miner.get(1) });
        GTModHandler.addShapelessCraftingRecipe(ItemRegistry.VoidMinerEX3, new Object[] { ItemList.OreDrill1.get(1) });
        GTModHandler.addShapelessCraftingRecipe(ItemRegistry.VoidMinerEX4, new Object[] { ItemList.OreDrill2.get(1) });
    }
}
