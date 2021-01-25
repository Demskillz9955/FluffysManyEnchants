package com.ManyEnchants.Enchantments;

import com.ManyEnchants.ManyEnchants;

import UtilStuff.EnchantmentUtils;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class SwiftnessEnchantment extends Enchantment{
public static int UpgradeValue = 0;
public static int MaxLevel = 3;
	protected SwiftnessEnchantment(Rarity rarityIn, EnchantmentType armorLegs, EquipmentSlotType[] slots) {
		super(rarityIn, armorLegs, slots);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getMinLevel() {
		return 1;
	}

	@Override
	public int getMaxLevel() {
		return MaxLevel;
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
	public int getUpgradeValue() {
		return UpgradeValue;
	}
	public void  setUpgradeValue(int amount) {
	 UpgradeValue = amount;
	}
	@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
		public static class Speed{
			@SubscribeEvent
		public static void SwiftNess(PlayerTickEvent event) {
				PlayerEntity entity = event.player;
				World worldIn = entity.world;
	if (entity.hasItemInSlot(EquipmentSlotType.LEGS) 
						
						&& EnchantmentHelper.getEnchantmentLevel(Enchantments.SWIFTNESS.get(),entity.getItemStackFromSlot(EquipmentSlotType.LEGS)) > 0) {
		
		EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.SWIFTNESS.get(), 1,10, Effects.SPEED, EquipmentSlotType.LEGS);
		EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.SWIFTNESS.get(), 2,10, Effects.SPEED, EquipmentSlotType.LEGS);
		EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.SWIFTNESS.get(), 3,10, Effects.SPEED, EquipmentSlotType.LEGS);
		if(UpgradeValue > 0) {
			EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.SWIFTNESS.get(), UpgradeValue,10, Effects.SPEED, EquipmentSlotType.LEGS);
			EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.SWIFTNESS.get(), UpgradeValue + 1,10, Effects.SPEED, EquipmentSlotType.LEGS);
			EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.SWIFTNESS.get(), UpgradeValue + 2,10, Effects.SPEED, EquipmentSlotType.LEGS);
		}
				

		}
			}
		}
}
