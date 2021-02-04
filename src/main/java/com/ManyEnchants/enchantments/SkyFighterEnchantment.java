package com.ManyEnchants.enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
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
			   @Override
				  public ITextComponent getDisplayName(int level) {
				      IFormattableTextComponent iformattabletextcomponent = new TranslationTextComponent(this.getName());
				      if (this.isCurse()) {
				         iformattabletextcomponent.mergeStyle(TextFormatting.RED);
				      } else {
				         iformattabletextcomponent.mergeStyle(TextFormatting.GOLD);
				      }

				      if (level != 1 || this.getMaxLevel() != 1) {
				         iformattabletextcomponent.appendString(" ").append(new TranslationTextComponent("enchantment.level." + level));
				      }

				      return iformattabletextcomponent;
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
