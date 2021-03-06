package MysticWorld.Items;

import MysticWorld.MysticWorld;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemVerditeArmor extends ItemArmor implements IArmorTextureProvider
{
	int ArmorType;
	
	String ArmorFile_1;
	String ArmorFile_2;

	public ItemVerditeArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
			
			super(par1, par2EnumArmorMaterial,par3,par4);
			this.ArmorType=par4;
			this.setCreativeTab(MysticWorld.MysticWorldTab);
			this.ArmorFile_1 = "/mods/MysticTextures/textures/armor/verdite_1.png";
			this.ArmorFile_2 = "/mods/MysticTextures/textures/armor/verdite_2.png";
		}

		@Override
		public void registerIcons(IconRegister iconRegister)
		{
			switch (ArmorType){
			case 0:
		        itemIcon = iconRegister.registerIcon("MysticTextures:item.helmetVerdite");
		        break;
			case 1:
				itemIcon = iconRegister.registerIcon("MysticTextures:item.chestplateVerdite");
		        break;
			case 2:
				itemIcon = iconRegister.registerIcon("MysticTextures:item.leggingsVerdite");
		        break;
			case 3:
				itemIcon = iconRegister.registerIcon("MysticTextures:item.bootsVerdite");
		        break;
			}
		}
		
		public String getArmorTextureFile(ItemStack par1){
			if(par1.itemID == ItemHandler$1.verditeHelmet.itemID||par1.itemID == ItemHandler$1.verditeChestplate.itemID||par1.itemID == ItemHandler$1.verditeBoots.itemID)
			{
				return ArmorFile_1;
			}
			if(par1.itemID == ItemHandler$1.verditeLeggings.itemID)
			{
				return ArmorFile_2;
			}
			return ArmorFile_2;
				
		}
}
