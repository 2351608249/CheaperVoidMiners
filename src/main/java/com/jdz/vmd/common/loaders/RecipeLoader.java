package com.jdz.vmd.common.loaders;

import gregtech.api.enums.ItemList;
import gregtech.api.util.GTModHandler;

public class RecipeLoader {

    public static void run() {
        GTModHandler.addShapelessCraftingRecipe(ItemRegistry.VoidMinerEX, new Object[] { ItemList.OreDrill1.get(1) });
    }
}
