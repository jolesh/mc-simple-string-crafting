package de.jolesh.simplestringcrafting;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = "ssc", name = "Simple String Crafting", version = "1.0")
public class SimpleStingCrafting {
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Items/BLock init and reg
		//Config handeling
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		//Proxy, TileEntity, GUI and Packet Registering
		
		GameRegistry.addRecipe(new ItemStack(Items.string, 4), new Object[] {"W", 'W', Blocks.wool});
	}

	@EventHandler
	public void Init(FMLPostInitializationEvent event) {
		
	}
}
