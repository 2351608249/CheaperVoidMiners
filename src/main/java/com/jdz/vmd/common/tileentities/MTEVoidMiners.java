package com.jdz.vmd.common.tileentities;

import gregtech.api.GregTechAPI;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.util.GTUtility;

public class MTEVoidMiners {

    public static class VMLV extends MTEVoidMinerEXBase {

        public VMLV(int aID, String aName, String aNameRegional) {
            super(aID, aName, aNameRegional, 4);
        }

        public VMLV(String aName, int tier) {
            super(aName, tier);
        }

        @Override
        protected ItemList getCasingBlockItem() {
            return ItemList.Casing_SolidSteel;
        }

        @Override
        protected Materials getFrameMaterial() {
            return Materials.Steel;
        }

        @Override
        protected int getCasingTextureIndex() {
            return 16;
        }

        @Override
        protected int getMinTier() {
            return 1; // LV
        }

        @Override
        public IMetaTileEntity newMetaEntity(IGregTechTileEntity iGregTechTileEntity) {
            return new VMLV(this.mName, this.TIER_MULTIPLIER);
        }

    }

    public static class VMHV extends MTEVoidMinerEXBase {

        public VMHV(int aID, String aName, String aNameRegional) {
            super(aID, aName, aNameRegional, 8);
        }

        public VMHV(String aName, int tier) {
            super(aName, tier);
        }

        @Override
        protected ItemList getCasingBlockItem() {
            return ItemList.Casing_CleanStainlessSteel;
        }

        @Override
        protected Materials getFrameMaterial() {
            return Materials.StainlessSteel;
        }

        @Override
        protected int getCasingTextureIndex() {
            return GTUtility.getCasingTextureIndex(GregTechAPI.sBlockCasings4, 1);
        }

        @Override
        protected int getMinTier() {
            return 3;
        }

        @Override
        public IMetaTileEntity newMetaEntity(IGregTechTileEntity iGregTechTileEntity) {
            return new VMHV(this.mName, this.TIER_MULTIPLIER);
        }

    }

    public static class VMIV extends MTEVoidMinerEXBase {

        public VMIV(int aID, String aName, String aNameRegional) {
            super(aID, aName, aNameRegional, 16);
        }

        public VMIV(String aName, int tier) {
            super(aName, tier);
        }

        @Override
        protected ItemList getCasingBlockItem() {
            return ItemList.Casing_RobustTungstenSteel;
        }

        @Override
        protected Materials getFrameMaterial() {
            return Materials.TungstenSteel;
        }

        @Override
        protected int getCasingTextureIndex() {
            return GTUtility.getCasingTextureIndex(GregTechAPI.sBlockCasings4, 0);
        }

        @Override
        protected int getMinTier() {
            return 5;
        }

        @Override
        public IMetaTileEntity newMetaEntity(IGregTechTileEntity iGregTechTileEntity) {
            return new VMIV(this.mName, this.TIER_MULTIPLIER);
        }

    }
}
