package com.jdz.vmd.common.tileentities;

import static gregtech.api.enums.HatchElement.*;
import static gregtech.api.enums.HatchElement.Energy;

import java.util.List;

import net.minecraft.item.ItemStack;

import com.google.common.collect.ImmutableList;

import bwcrossmod.galacticgreg.MTEVoidMinerBase;
import gregtech.api.enums.GTValues;
import gregtech.api.interfaces.IHatchElement;
import gregtech.common.tileentities.machines.multi.MTEDrillerBase;

public abstract class MTEVoidMinerEXBase extends MTEVoidMinerBase {

    public MTEVoidMinerEXBase(int aID, String aName, String aNameRegional, int multiplier) {
        super(aID, aName, aNameRegional, multiplier);
    }

    public MTEVoidMinerEXBase(String aName, int tier) {
        super(aName, tier);
    }

    @Override
    protected void setElectricityStats() {
        try {
            this.mEUt = this.isPickingPipes ? 30 : Math.toIntExact(GTValues.V[this.getMinTier()]);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            this.mEUt = Integer.MAX_VALUE - 7;
        }
        this.mOutputItems = new ItemStack[0];
        this.mProgresstime = 0;
        this.mMaxProgresstime = 10;
        this.mEfficiency = this.getCurrentEfficiency(null);
        this.mEfficiencyIncrease = 10000;
        this.mEUt = this.mEUt > 0 ? -this.mEUt : this.mEUt;
    }

    @Override
    protected List<IHatchElement<? super MTEDrillerBase>> getAllowedHatches() {
        return ImmutableList.of(InputBus, OutputBus, Maintenance, Energy);
    }

    //
    // @Override
    // protected MultiblockTooltipBuilder createTooltip() {
    // String casings = this.getCasingBlockItem()
    // .get(0)
    // .getDisplayName();
    //
    // final MultiblockTooltipBuilder tt = new MultiblockTooltipBuilder();
    // tt.addMachineType("Miner")
    // .addInfo("Controller Block for the Void Miner EX")
    // .addInfo("Consumes " + GTValues.V[this.getMinTier()] + "EU/t")
    // .addInfo("Does not support boosting with noble gasses.")
    // .addInfo(
    // "Will output " + 2 * this.TIER_MULTIPLIER
    // + " Ores per Second depending on the Dimension it is build in")
    // .addInfo("Put the Ore into the input bus to set the Whitelist/Blacklist")
    // .addInfo("Use a screwdriver to toggle Whitelist/Blacklist")
    // .addInfo(
    // "Blacklist or non Whitelist Ore will be " + EnumChatFormatting.DARK_RED
    // + "VOIDED"
    // + EnumChatFormatting.RESET
    // + ".")
    // .addSeparator()
    // .beginStructureBlock(3, 7, 3, false)
    // .addController("Front bottom")
    // .addOtherStructurePart(casings, "form the 3x1x3 Base")
    // .addOtherStructurePart(casings, "1x3x1 pillar above the center of the base (2 minimum total)")
    // .addOtherStructurePart(
    // this.getFrameMaterial().mName + " Frame Boxes",
    // "Each pillar's side and 1x3x1 on top")
    // .addEnergyHatch(VN[this.getMinTier()] + "+, Any base casing")
    // .addMaintenanceHatch("Any base casing")
    // .addInputBus("Mining Pipes or Ores, optional, any base casing")
    // .addOutputBus("Any base casing");
    // return tt;
    // }
}
