package com.parzivail.pswm.weaponry;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.parzivail.pswm.Resources;
import com.parzivail.pswm.StarWarsMod;

public class ItemSpawnDSTurret extends net.minecraft.item.Item
{
	public String name = "spawnDsTurret";

	public ItemSpawnDSTurret()
	{
		this.setUnlocalizedName(Resources.MODID + "." + this.name);
		this.setTextureName(Resources.MODID + ":" + this.name);
		this.setCreativeTab(StarWarsMod.StarWarsTab);
		this.maxStackSize = 1;
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par1, float par2, float par3, float par4)
	{
		if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(StarWarsMod.spawnDsTurret))
			if (!world.isRemote)
			{
				WeaponDSTurret turret = new WeaponDSTurret(world);
				turret.setPosition(x + 0.5D, y + 1, z + 0.5D);
				world.spawnEntityInWorld(turret);
			}
		return true;
	}
}
/*
 * Location: C:\Users\Colby\Downloads\Parzi's Star Wars Mod
 * v1.2.0-dev7.jar!\com\parzi\starwarsmod\vehicles\ItemSpawnSpeederBike.class
 * Java compiler version: 6 (50.0) JD-Core Version: 0.7.1
 */