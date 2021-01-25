package com.ManyEnchants.Enchantments;

import com.ManyEnchants.ManyEnchants;

import UtilStuff.EnchantmentUtils;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class DolphinBlessedEnchantment extends Enchantment {

	protected DolphinBlessedEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);
	}
		@Override 
		public int getMinLevel() {
			return 1;
		}
		@Override 
		public int getMaxLevel() {
			return 1;
		}
		@Override
		  public boolean canVillagerTrade() {
		      return true;
		   }

		  @Override
		   public boolean canGenerateInLoot() {
		      return true;
		   }
		  public boolean canApplyAtEnchantingTable() {
		      return true;
		  }
		  @Override
		  public boolean canApplyTogether(Enchantment ench) {
		      return super.canApplyTogether(ench) && ench != net.minecraft.enchantment.Enchantments.FROST_WALKER;
		   }
		
	
	 @Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
	public static class Blessing{
		@SubscribeEvent
		 public static void DolphinBless(PlayerTickEvent event) {
			PlayerEntity player = event.player;
			World worldIn = player.world;
			if(player.isInWater() == true) {
				EnchantmentUtils.AddEffectBasedOnLevelEntity(player, Enchantments.DOLPHIN_BLESSED.get(), 10, 1, Effects.DOLPHINS_GRACE, EquipmentSlotType.FEET);
				
			}
		 }
		public static int GetCurrentEnchantment(PlayerEntity player) {
			return EnchantmentHelper.getEnchantmentLevel(Enchantments.DOLPHIN_BLESSED.get(), player.getItemStackFromSlot(EquipmentSlotType.MAINHAND));
		}
		
	}
}
