package com.builtbroken.woodenhopper.hopper;

import com.builtbroken.woodenhopper.WoodenHopperMod;
import net.minecraft.block.BlockHopper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Green on 11/15/2016.
 */
public class BlockWoodenHopper extends BlockHopper {

    private IIcon outside;
    private IIcon top;
    private IIcon inside;

    public BlockWoodenHopper() {

        super();

        this.setBlockName(WoodenHopperMod.PREFIX + "woodenHopper");
        this.setBlockTextureName(WoodenHopperMod.PREFIX + "woodenHopper");
        //this.setHardness(0.0F);
        //this.setLightLevel(0.9375F);
        this.setStepSound(soundTypeWood);

    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TileEntityWoodenHopper();
    }

    @Override
    public String getItemIconName()
    {
        return WoodenHopperMod.PREFIX+"hopper";
    }

    @Override
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.top : this.outside;
    }

    @Override
    public void registerBlockIcons(IIconRegister iReg)
    {
        this.outside = iReg.registerIcon(WoodenHopperMod.PREFIX + "hopper_outside");
        this.top = iReg.registerIcon(WoodenHopperMod.PREFIX + "hopper_top");
        this.inside = iReg.registerIcon(WoodenHopperMod.PREFIX + "hopper_inside");
    }


}
