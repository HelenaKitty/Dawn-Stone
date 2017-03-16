package design.myown.newDecorItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DawnStoneYellow extends Block {
	protected DawnStoneYellow(Material material) {
		super(material);
		this.setHardness(5.0F);
		this.setResistance(5.0F);
		this.setLightLevel(0.8F);
		this.setHarvestLevel("axe", 2);
	}
}
