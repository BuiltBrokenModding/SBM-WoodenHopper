package com.builtbroken.woodenhopper.hopper;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.world.IBlockAccess;

/**
 * Created by world on 11/15/2016.
 */
public class TileEntityWoodenHopper extends TileEntityHopper {

    private ItemStack[] invSize = new ItemStack[5];

    public static TileEntityWoodenHopper func_149920_e(IBlockAccess p_149920_0_, int p_149920_1_, int p_149920_2_, int p_149920_3_)
    {
        return (TileEntityWoodenHopper)p_149920_0_.getTileEntity(p_149920_1_, p_149920_2_, p_149920_3_);
    }

    public TileEntityWoodenHopper()
    {
        super();
    }

    @Override
    public int getSizeInventory()
    {
        return this.invSize.length;
    }

}
