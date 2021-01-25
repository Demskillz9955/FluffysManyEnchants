package com.ManyEnchants.Enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class SkyFighterEnchantment extends Enchantment{
public static float HeightCalc = 0;
	protected SkyFighterEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);
		
	}
	 public boolean isTreasureEnchantment() {
	      return false;
	   }

	   public boolean isCurse() {
	      return false;
	   }
	   public boolean canVillagerTrade() {
		      return true;
		   }

		  
		   public boolean canGenerateInLoot() {
		      return true;
		   }
		   public int getMinLevel() {
			      return 1;
			   }
			   public int getMaxLevel() {
			      return 3;
			   }
			   public float calcDamageByCreature(int level, CreatureAttribute creatureType) {
				return HeightCalc * level;
			   }
			   @Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
				 public static class SkyFighter{
					 
				   @SubscribeEvent
				   public static void GetPlayerY(PlayerTickEvent event) {
					   PlayerEntity player = event.player;
					   
					   if(player.getPosition().getY() ==80) {
						   HeightCalc = 1.0f;
					   }else if(player.getPosition().getY() ==100) {
						   HeightCalc = 1.5f;
					   }else if(player.getPosition().getY() ==150) {
						   HeightCalc = 2.0f;
					   }else if(player.getPosition().getY() ==190) {
						   HeightCalc = 2.5f;
					   }else if(player.getPosition().getY() ==200) {
						   HeightCalc = 3.0f; 
					   }else if(player.getPosition().getY() <50) {
						 HeightCalc = 0.0f;  
					   }
				   }
				   
				   
				 }
					
}
