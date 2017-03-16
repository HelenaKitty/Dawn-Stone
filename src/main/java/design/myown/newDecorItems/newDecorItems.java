package design.myown.newDecorItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "dsnewitems", name = "New Decoration Items", version = "1.0")
public class newDecorItems {
	
	//blocks
	public static Block dawnStoneOreBlue;
	public static Block dawnStoneBlue;
	public static Block dawnStoneOreCyan;
	public static Block dawnStoneCyan;
	public static Block dawnStoneOreLime;
	public static Block dawnStoneLime;
	public static Block dawnStoneOreMagenta;
	public static Block dawnStoneMagenta;
	public static Block dawnStoneOreYellow;
	public static Block dawnStoneYellow;
	public static Block dawnStoneOreRed;
	public static Block dawnStoneRed;
	
	public static Block dawnStoneWarningZone;
	
	public static Block dawnStoneBlueLamp;
	public static Block dawnStoneGreenLamp;
	public static Block dawnStoneRedLamp;
	
	public static Block dawnStonePink;
	
	//item
	public static Item dawnStoneGreenCrystals;
	public static Item dawnStoneBlueCrystals;
	public static Item dawnStoneCyanCrystals;
	public static Item dawnStoneMagentaCrystals;
	public static Item dawnStoneRedCrystals;

	//items weapons
	
	
	public static Item dawnStoneMagentaSword;
	public static Item dawnStoneRedSword;
	
	public static final Item.ToolMaterial dawnStoneMagentaMaterial = EnumHelper.addToolMaterial("dawnStoneMagentaMaterial", 4, 2000, 15.0F, 10.0F, 10);
	public static final Item.ToolMaterial dawnStoneRedMaterial = EnumHelper.addToolMaterial("dawnStoneRedMaterial", 2, 3000, 25.0F, 13.0F, 10);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		//blocks 
		dawnStoneOreBlue = new DawnStoneOreBlue(Material.rock).setBlockName("DawnStoneOreBlue").setBlockTextureName("dsnewitems:OreBlue").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneOreBlue, dawnStoneOreBlue.getUnlocalizedName().substring(5));
		dawnStoneBlue = new DawnStoneBlue(Material.rock).setBlockName("DawnStoneBlue").setBlockTextureName("dsnewitems:StoneBlue").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneBlue, dawnStoneBlue.getUnlocalizedName().substring(5));
		dawnStoneOreCyan = new DawnStoneOreCyan(Material.rock).setBlockName("DawnStoneOreCyan").setBlockTextureName("dsnewitems:OreCyan").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneOreCyan, dawnStoneOreCyan.getUnlocalizedName().substring(5));
		dawnStoneCyan = new DawnStoneCyan(Material.rock).setBlockName("DawnStoneCyan").setBlockTextureName("dsnewitems:StoneCyan").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneCyan, dawnStoneCyan.getUnlocalizedName().substring(5));
		dawnStoneOreMagenta = new DawnStoneOreMagenta(Material.rock).setBlockName("DawnStoneOreMagenta").setBlockTextureName("dsnewitems:OreMagenta").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneOreMagenta, dawnStoneOreMagenta.getUnlocalizedName().substring(5));
		dawnStoneMagenta = new DawnStoneMagenta(Material.rock).setBlockName("DawnStoneMagenta").setBlockTextureName("dsnewitems:StoneMagenta").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneMagenta, dawnStoneMagenta.getUnlocalizedName().substring(5));
		dawnStoneOreLime = new DawnStoneOreLime(Material.rock).setBlockName("DawnStoneOreLime").setBlockTextureName("dsnewitems:OreLime").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneOreLime, dawnStoneOreLime.getUnlocalizedName().substring(5));
		dawnStoneLime = new DawnStoneLime(Material.rock).setBlockName("DawnStoneLime").setBlockTextureName("dsnewitems:StoneLime").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneLime, dawnStoneLime.getUnlocalizedName().substring(5));
		dawnStoneOreYellow = new DawnStoneOreYellow(Material.rock).setBlockName("DawnStoneOreYellow").setBlockTextureName("dsnewitems:OreYellow").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneOreYellow, dawnStoneOreYellow.getUnlocalizedName().substring(5));
		dawnStoneYellow = new DawnStoneYellow(Material.rock).setBlockName("DawnStoneYellow").setBlockTextureName("dsnewitems:StoneYellow").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneYellow, dawnStoneYellow.getUnlocalizedName().substring(5));
		dawnStoneOreRed = new DawnStoneOreRed(Material.rock).setBlockName("DawnStoneOreRed").setBlockTextureName("dsnewitems:OreRed").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneOreRed, dawnStoneOreRed.getUnlocalizedName().substring(5));
		dawnStoneRed = new DawnStoneRed(Material.rock).setBlockName("DawnStoneRed").setBlockTextureName("dsnewitems:StoneRed").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneRed, dawnStoneRed.getUnlocalizedName().substring(5));
		
		dawnStoneBlueLamp = new DawnStoneBlueLamp(Material.rock).setBlockName("DawnStoneBlueLamp").setBlockTextureName("dsnewitems:bluelamp").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneBlueLamp, dawnStoneBlueLamp.getUnlocalizedName().substring(5));
		dawnStoneRedLamp = new DawnStoneRedLamp(Material.rock).setBlockName("DawnStoneRedLamp").setBlockTextureName("dsnewitems:redlamp").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneRedLamp, dawnStoneRedLamp.getUnlocalizedName().substring(5));
		dawnStoneGreenLamp = new DawnStoneGreenLamp(Material.rock).setBlockName("DawnStoneGreenLamp").setBlockTextureName("dsnewitems:greenlamp").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneGreenLamp, dawnStoneGreenLamp.getUnlocalizedName().substring(5));
		
		dawnStoneWarningZone = new DawnStoneWarningZone(Material.rock).setBlockName("DawnStoneWarningZone").setBlockTextureName("dsnewitems:WarningBlock").setCreativeTab(tabdsnewitems);
		GameRegistry.registerBlock(dawnStoneWarningZone, dawnStoneWarningZone.getUnlocalizedName().substring(5));
		
		//items
		dawnStoneBlueCrystals = new DawnStoneBlueCrystals().setUnlocalizedName("DawnStoneBlueCrystals").setTextureName("dsnewitems:BlueCrystal").setCreativeTab(tabdsnewitems);
		GameRegistry.registerItem(dawnStoneBlueCrystals, dawnStoneBlueCrystals.getUnlocalizedName().substring(5));
		dawnStoneCyanCrystals = new DawnStoneCyanCrystals().setUnlocalizedName("DawnStoneCyanCrystals").setTextureName("dsnewitems:CyanCrystal").setCreativeTab(tabdsnewitems);
		GameRegistry.registerItem(dawnStoneCyanCrystals, dawnStoneCyanCrystals.getUnlocalizedName().substring(5));
		dawnStoneMagentaCrystals = new DawnStoneMagentaCrystals().setUnlocalizedName("DawnStoneMagentaCrystals").setTextureName("dsnewitems:MagentaCrystal").setCreativeTab(tabdsnewitems);
		GameRegistry.registerItem(dawnStoneMagentaCrystals, dawnStoneMagentaCrystals.getUnlocalizedName().substring(5));
		dawnStoneRedCrystals = new DawnStoneRedCrystals().setUnlocalizedName("DawnStoneRedCrystals").setTextureName("dsnewitems:RedCrystal").setCreativeTab(tabdsnewitems);
		GameRegistry.registerItem(dawnStoneRedCrystals, dawnStoneRedCrystals.getUnlocalizedName().substring(5));
		
		
		dawnStoneGreenCrystals = new DawnStoneGreenCrystals().setUnlocalizedName("DawnStoneGreenCrystals").setTextureName("dsnewitems:GreenCrystal").setCreativeTab(tabdsnewitems);
		GameRegistry.registerItem(dawnStoneGreenCrystals, dawnStoneGreenCrystals.getUnlocalizedName().substring(5));
		
		//items weapons
		dawnStoneMagentaSword = new DawnStoneMagentaSword(dawnStoneMagentaMaterial).setUnlocalizedName("DawnStoneMagentaSword").setTextureName("dsnewitems:DawnStoneMagentaSword").setCreativeTab(tabdsnewitems);
		GameRegistry.registerItem(dawnStoneMagentaSword, dawnStoneMagentaSword.getUnlocalizedName().substring(5));
		dawnStoneRedSword = new DawnStoneRedSword(dawnStoneRedMaterial).setUnlocalizedName("DawnStoneRedSword").setTextureName("dsnewitems:DawnStoneRedSword").setCreativeTab(tabdsnewitems);
		GameRegistry.registerItem(dawnStoneRedSword, dawnStoneRedSword.getUnlocalizedName().substring(5));
		
		//BlockSlabs
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		GameRegistry.addRecipe(new ItemStack(dawnStoneMagentaSword), new Object[]{" M "," M "," W ", 'M', dawnStoneMagenta, 'W', Items.stick});
		GameRegistry.addRecipe(new ItemStack(dawnStoneRedSword), new Object[]{" R "," R "," W ", 'R', dawnStoneRed, 'W', Items.stick});
		//		
		GameRegistry.addRecipe(new ItemStack(dawnStoneLime), new Object[]{"LL ","LL ","   ", 'L', dawnStoneOreLime});
		GameRegistry.addSmelting(dawnStoneOreLime, new ItemStack(dawnStoneGreenCrystals), 5.0F);
		GameRegistry.addSmelting(dawnStoneOreBlue, new ItemStack(dawnStoneBlueCrystals), 5.0F);
		GameRegistry.addSmelting(dawnStoneOreCyan, new ItemStack(dawnStoneCyanCrystals), 5.0F);
		GameRegistry.addSmelting(dawnStoneOreMagenta, new ItemStack(dawnStoneMagentaCrystals), 5.0F);
		GameRegistry.addSmelting(dawnStoneOreRed, new ItemStack(dawnStoneRedCrystals), 5.0F);
		
		
		GameRegistry.addRecipe(new ItemStack(dawnStoneBlueLamp), new Object[]{"CCC","CBC","CCC", 'C', Blocks.coal_block, 'B', dawnStoneBlueCrystals});
		GameRegistry.addRecipe(new ItemStack(dawnStoneRedLamp), new Object[]{"CCC","CRC","CCC", 'C', Blocks.coal_block, 'R', dawnStoneRedCrystals});
		
		GameRegistry.addRecipe(new ItemStack(dawnStoneBlue), new Object[]{"BBB","BBB","BBB", 'B', dawnStoneBlueCrystals});
		GameRegistry.addRecipe(new ItemStack(dawnStoneMagenta), new Object[]{"BBB","BBB","BBB", 'B', dawnStoneMagentaCrystals});
		GameRegistry.addRecipe(new ItemStack(dawnStoneRed), new Object[]{"BBB","BBB","BBB", 'B', dawnStoneRedCrystals});


	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}

	public static CreativeTabs tabdsnewitems = new CreativeTabs("tabdsnewitems"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(dawnStoneMagentaSword).getItem();
		}
		
	};
}
