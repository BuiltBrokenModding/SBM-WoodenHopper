package com.builtbroken.woodenhopper;

import com.builtbroken.woodenhopper.hopper.BlockWoodenHopper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntityHopper;

/**
 * Simple mod to add wooden hoppers to MC.
 * Created by Green on 11/15/2016.
 */

@Mod(modid = WoodenHopperMod.DOMAIN, name = "Wooden Hopper Mod", version = "@MAJOR@.@MINOR@.@REVIS@.@BUILD@")
public class WoodenHopperMod {

    public static final String DOMAIN = "woodenhopper";
    public static final String PREFIX = DOMAIN + ":";

    private Block blockHopper;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        blockHopper = new BlockWoodenHopper();

        GameRegistry.registerBlock(blockHopper, "WoodenHopper");
        GameRegistry.registerTileEntity(TileEntityHopper.class, "WoodenHopper");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //GameRegistry.addRecipe();

    }

}
