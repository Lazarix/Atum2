package com.teammetallurgy.atum.utils;

import com.teammetallurgy.atum.init.AtumItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class AtumCreativeTab extends CreativeTabs {

    public AtumCreativeTab() {
        super(Constants.MOD_ID);
    }

    @Override
    @Nonnull
    public ItemStack createIcon() {
        return new ItemStack(AtumItems.SCARAB);
    }
}