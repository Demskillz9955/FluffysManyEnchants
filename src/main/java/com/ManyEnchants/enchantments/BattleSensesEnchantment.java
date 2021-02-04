package com.ManyEnchants.enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import util.EnchantmentUtils;

public class BattleSensesEnchantment extends Enchantment {

	protected BattleSensesEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);

	}

	@Override
	public int getMinLevel() {
		return 1;
	}

	@Override
	public int getMaxLevel() {
		return 6;
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
	public static class BattleSenses {
		@SubscribeEvent
		public static void SensesOfBattle(LivingDamageEvent event) {
			LivingEntity entity = event.getEntityLiving();
			World worldIn = entity.world;
			EnchantmentUtils utils = null;
			if (entity.hasItemInSlot(EquipmentSlotType.CHEST)

					&& EnchantmentHelper.getEnchantmentLevel(Enchantments.BATTLE_SENSES.get(),
							entity.getItemStackFromSlot(EquipmentSlotType.CHEST)) > 0) {
				if (EnchantmentUtils.RandomAction() == true) {
					if (entity.getHealth() < 5.5f) {
						// lvl 1
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 1, 600,
								Effects.SPEED, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 1, 600,
								Effects.STRENGTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 1, 600,
								Effects.INSTANT_HEALTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 1, 600,
								Effects.ABSORPTION, EquipmentSlotType.CHEST);
						// lvl 2
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 2, 600,
								Effects.SPEED, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 2, 600,
								Effects.STRENGTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 2, 600,
								Effects.INSTANT_HEALTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 2, 600,
								Effects.ABSORPTION, EquipmentSlotType.CHEST);
						// lvl 3
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 3, 600,
								Effects.SPEED, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 3, 600,
								Effects.STRENGTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 3, 600,
								Effects.INSTANT_HEALTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 3, 600,
								Effects.ABSORPTION, EquipmentSlotType.CHEST);
						// lvl 4
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 4, 600,
								Effects.SPEED, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 4, 600,
								Effects.STRENGTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 4, 600,
								Effects.INSTANT_HEALTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 4, 600,
								Effects.ABSORPTION, EquipmentSlotType.CHEST);
						// lvl 5
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 5, 600,
								Effects.SPEED, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 5, 600,
								Effects.STRENGTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 5, 600,
								Effects.INSTANT_HEALTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 5, 600,
								Effects.ABSORPTION, EquipmentSlotType.CHEST);
						// lvl 6
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 6, 600,
								Effects.SPEED, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 6, 600,
								Effects.STRENGTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 6, 600,
								Effects.INSTANT_HEALTH, EquipmentSlotType.CHEST);
						EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.BATTLE_SENSES.get(), 6, 600,
								Effects.ABSORPTION, EquipmentSlotType.CHEST);
					}
				}
			}
		}
	}

}
