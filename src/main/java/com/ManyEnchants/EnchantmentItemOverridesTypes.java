package com.ManyEnchants;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public enum EnchantmentItemOverridesTypes {
//Going to be used for a future version
	ARMOURITEM{
		public boolean canBeUsed(Item item) {
			return item instanceof ArmorItem && ((ArmorItem)item).getEquipmentSlot() == EquipmentSlotType.MAINHAND;
		}
		
	}
}
