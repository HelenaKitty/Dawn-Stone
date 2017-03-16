package design.myown.newDecorItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DawnStonePink extends Block {

	protected DawnStonePink(Material material) {
		super(material);
		this.setHardness(5.0F);
		this.setResistance(5.0F);
		this.setLightLevel(0.8F);
		this.setHarvestLevel("axe", 2);
	}

}
