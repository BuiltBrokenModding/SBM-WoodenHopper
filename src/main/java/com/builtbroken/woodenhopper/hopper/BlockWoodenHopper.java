package com.builtbroken.woodenhopper.hopper;

import com.builtbroken.woodenhopper.WoodenHopperMod;
import net.minecraft.block.BlockHopper;

/**
 * Created by Green on 11/15/2016.
 */
public class BlockWoodenHopper extends BlockHopper
{

    public BlockWoodenHopper()
    {

        super();

        this.setBlockName(WoodenHopperMod.PREFIX + "woodenHopper");
        this.setBlockTextureName(WoodenHopperMod.PREFIX + "woodenHopper");
        //this.setHardness(0.0F);
        //this.setLightLevel(0.9375F);
        this.setStepSound(soundTypeWood);

    }

}
