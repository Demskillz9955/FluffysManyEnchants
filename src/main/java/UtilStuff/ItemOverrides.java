package UtilStuff;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public enum ItemOverrides {
HOEITEM{
	public boolean CanBeUsedInEnchantemnt(Item itemIn) {
		return itemIn instanceof HoeItem;
	}
},
PICKAXEITEM{
	public boolean CanBeUsed(Item itemIn) {
		return itemIn instanceof PickaxeItem;
	}
	
}
	
	
}
