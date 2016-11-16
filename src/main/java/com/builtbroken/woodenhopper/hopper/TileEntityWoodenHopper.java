package com.builtbroken.woodenhopper.hopper;

import net.minecraft.tileentity.TileEntityHopper;

/**
 * Created by world on 11/15/2016.
 */
public class TileEntityWoodenHopper extends TileEntityHopper
{

    public TileEntityWoodenHopper()
    {
        super();

        this.getSizeInventory();
    }

    @Override
    public int getSizeInventory()
    {
        return 1;
    }

}
