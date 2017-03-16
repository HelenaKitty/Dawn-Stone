package design.myown.newDecorItems;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DawnStoneWarningZone extends Block {
	
	protected DawnStoneWarningZone(Material material) {
		super(material);
		this.setHardness(20.0F);
		this.setResistance(10.0F);
		this.setLightLevel(0.2F);
		this.setHarvestLevel("axe", 5);
	}

}
