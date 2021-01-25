package com.ManyEnchants.Enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class EarthenEnchantment extends Enchantment{
public static float EarthenValue;
	protected EarthenEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
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
				return EarthenValue * level;
			   }
			    @Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
				 public static class Earthen{
					 
				   @SubscribeEvent
				   public static void GetPlayerDimension(PlayerTickEvent event) {
					   PlayerEntity player = event.player;
					   World worldIn = player.world;
					   if(worldIn.getDimensionType().doesBedWork() == true) {
						   EarthenValue = 2.0f;
					   }else {
						   EarthenValue = 0.0f;
					   }
				   }
				   }
}
