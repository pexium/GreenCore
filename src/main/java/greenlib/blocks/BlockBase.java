package greenlib.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


public class BlockBase extends Block{

	protected String name;
	public BlockBase(Material material, String name, float res, float hrd, String tool, int hLvl) {
		super(material);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(res);
		setHardness(hrd);
		setHarvestLevel(tool, hLvl);
		
	}
	public void registerItemModel(Item itemBlock) {
		greenlib.main.GreenLib.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
