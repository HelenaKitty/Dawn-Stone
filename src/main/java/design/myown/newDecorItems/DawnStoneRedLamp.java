package design.myown.newDecorItems;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DawnStoneRedLamp extends Block {
	protected DawnStoneRedLamp(Material material) {
		super(material);
		this.setHardness(5.0F);
		this.setResistance(5.0F);
		this.setLightLevel(1.0F);
		this.setHarvestLevel("axe", 2);
	}
}
