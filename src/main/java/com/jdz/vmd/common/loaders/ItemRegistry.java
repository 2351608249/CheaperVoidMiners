package com.jdz.vmd.common.loaders;

import static com.jdz.vmd.api.enums.MetaTileEntityIDs.*;

import net.minecraft.item.ItemStack;

import com.jdz.vmd.common.tileentities.MTEVoidMiners;

public class ItemRegistry {

    public static ItemStack VoidMinerEX1;
    public static ItemStack VoidMinerEX2;
    public static ItemStack VoidMinerEX3;

    public static void run() {
        ItemRegistry.VoidMinerEX1 = new MTEVoidMiners.VMLV(VoidMinerEX1Controller.ID, "VoidMinerEX1", "Void Miner EX I")
            .getStackForm(1L);
        ItemRegistry.VoidMinerEX2 = new MTEVoidMiners.VMHV(
            VoidMinerEX2Controller.ID,
            "VoidMinerEX2",
            "Void Miner EX II").getStackForm(1L);
        ItemRegistry.VoidMinerEX3 = new MTEVoidMiners.VMIV(
            VoidMinerEX3Controller.ID,
            "VoidMinerEX3",
            "Void Miner EX III").getStackForm(1L);
    }
}
