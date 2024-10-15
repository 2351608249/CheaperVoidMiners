package com.jdz.vmd.common.loaders;

import static com.jdz.vmd.api.enums.MetaTileEntityIDs.VoidMinerEXController;

import net.minecraft.item.ItemStack;

import com.jdz.vmd.common.tileentities.MTEVoidMiners;

public class ItemRegistry {

    public static ItemStack VoidMinerEX;

    public static void run() {
        ItemRegistry.VoidMinerEX = new MTEVoidMiners.VMEX(VoidMinerEXController.ID, "VoidMinerEX", "Void Miner EX")
            .getStackForm(1L);
    }
}
