package com.jdz.vmd.common.tileentities;

import static gregtech.api.enums.GTValues.VN;
import static gregtech.api.enums.HatchElement.*;

import java.util.List;

import net.minecraft.util.EnumChatFormatting;

import com.google.common.collect.ImmutableList;

import bwcrossmod.galacticgreg.MTEVoidMinerBase;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.interfaces.IHatchElement;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.util.MultiblockTooltipBuilder;
import gregtech.common.tileentities.machines.multi.MTEDrillerBase;

public class MTEVoidMiners {

    public static class VMEX extends MTEVoidMinerBase {

        public VMEX(int aID, String aName, String aNameRegional) {
            super(aID, aName, aNameRegional, 16);
        }

        public VMEX(String aName, int tier) {
            super(aName, tier);
        }

        @Override
        protected ItemList getCasingBlockItem() {
            return ItemList.Casing_EV;
        }

        @Override
        protected Materials getFrameMaterial() {
            return Materials.Titanium;
        }

        @Override
        protected int getCasingTextureIndex() {
            return 8;
        }

        @Override
        protected int getMinTier() {
            return 4; // EV
        }

        @Override
        protected List<IHatchElement<? super MTEDrillerBase>> getAllowedHatches() {
            return ImmutableList.of(InputBus, OutputBus, Maintenance, Energy);
        }

        @Override
        protected MultiblockTooltipBuilder createTooltip() {
            String casings = this.getCasingBlockItem()
                .get(0)
                .getDisplayName();

            final MultiblockTooltipBuilder tt = new MultiblockTooltipBuilder();
            tt.addMachineType("Miner")
                .addInfo("Controller Block for the Void Miner EX")
                .addInfo("Consumes " + GTValues.V[this.getMinTier()] + "EU/t")
                .addInfo("Does not support boosting with noble gasses.")
                .addInfo(
                    "Will output " + 2 * this.TIER_MULTIPLIER
                        + " Ores per Second depending on the Dimension it is build in")
                .addInfo("Put the Ore into the input bus to set the Whitelist/Blacklist")
                .addInfo("Use a screwdriver to toggle Whitelist/Blacklist")
                .addInfo(
                    "Blacklist or non Whitelist Ore will be " + EnumChatFormatting.DARK_RED
                        + "VOIDED"
                        + EnumChatFormatting.RESET
                        + ".")
                .addSeparator()
                .beginStructureBlock(3, 7, 3, false)
                .addController("Front bottom")
                .addOtherStructurePart(casings, "form the 3x1x3 Base")
                .addOtherStructurePart(casings, "1x3x1 pillar above the center of the base (2 minimum total)")
                .addOtherStructurePart(
                    this.getFrameMaterial().mName + " Frame Boxes",
                    "Each pillar's side and 1x3x1 on top")
                .addEnergyHatch(VN[this.getMinTier()] + "+, Any base casing")
                .addMaintenanceHatch("Any base casing")
                .addInputBus("Mining Pipes or Ores, optional, any base casing")
                .addInputHatch("Optional noble gas, any base casing")
                .addOutputBus("Any base casing");
            return tt;
        }

        @Override
        public IMetaTileEntity newMetaEntity(IGregTechTileEntity iGregTechTileEntity) {
            return new VMEX(this.mName, this.TIER_MULTIPLIER);
        }
    }
}
