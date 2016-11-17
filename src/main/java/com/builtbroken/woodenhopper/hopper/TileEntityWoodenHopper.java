package com.builtbroken.woodenhopper.hopper;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.world.IBlockAccess;

/**
 * Created by world on 11/15/2016.
 */
public class TileEntityWoodenHopper extends TileEntityHopper {

    public TileEntityWoodenHopper()
    {
        super();
    }

    @Override
    public int getSizeInventory()
    {
        return 1;
    }

    @Override
    public String getInventoryName()
    {
        return "Wooden Hopper";
    }

}
