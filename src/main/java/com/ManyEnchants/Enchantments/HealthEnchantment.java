package com.ManyEnchants.Enchantments;

import com.ManyEnchants.ManyEnchants;

import UtilStuff.EnchantmentUtils;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class HealthEnchantment extends Enchantment {

	protected HealthEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);
		
	}
	@Override
	public int getMinLevel() {
		return 1;
	}

	@Override
	public int getMaxLevel() {
		return 4;
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
	
	@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
	public static class Health{
		@SubscribeEvent
		public static void health(PlayerTickEvent event) {
			PlayerEntity entity = event.player;
			World worldIn = entity.world;
			EnchantmentUtils utils = null;
if (entity.hasItemInSlot(EquipmentSlotType.CHEST) 
		&& EnchantmentHelper.getEnchantmentLevel(Enchantments.HEALTH.get(),entity.getItemStackFromSlot(EquipmentSlotType.CHEST)) > 0) {
			
	
	EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.HEALTH.get(), 1,10, Effects.ABSORPTION, EquipmentSlotType.CHEST);
	EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.HEALTH.get(), 2,10, Effects.ABSORPTION, EquipmentSlotType.CHEST);
	EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.HEALTH.get(), 3,10, Effects.ABSORPTION, EquipmentSlotType.CHEST);
	EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.HEALTH.get(), 4,10, Effects.ABSORPTION, EquipmentSlotType.CHEST);
			
		}
			
	}
		
		
		
		
	}
	
	
}
