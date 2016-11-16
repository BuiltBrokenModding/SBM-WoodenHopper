package com.builtbroken.woodenhopper.hopper;

import com.builtbroken.woodenhopper.WoodenHopperMod;
import net.minecraft.block.BlockHopper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Green on 11/15/2016.
 */
public class BlockWoodenHopper extends BlockHopper {

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TileEntityWoodenHopper();
    }

    public BlockWoodenHopper() {

        super();

        this.setBlockName(WoodenHopperMod.PREFIX + "woodenHopper");
        this.setBlockTextureName(WoodenHopperMod.PREFIX + "woodenHopper");
        //this.setHardness(0.0F);
        //this.setLightLevel(0.9375F);
        this.setStepSound(soundTypeWood);

    }



}
