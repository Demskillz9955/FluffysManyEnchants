package com.ManyEnchants.enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import util.EnchantmentUtils;

public class LightnessEnchantment extends Enchantment {

	protected LightnessEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMinLevel() {
		return 1;
	}

	@Override
	public int getMaxLevel() {
		return 3;
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
	public static class Lightness {
		@SubscribeEvent
		public static void LightNess(PlayerTickEvent event) {
			PlayerEntity entity = event.player;
			World worldIn = entity.world;
			if (entity.hasItemInSlot(EquipmentSlotType.FEET)

					&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LIGHTNESS.get(),
							entity.getItemStackFromSlot(EquipmentSlotType.FEET)) > 0) {
				EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.LIGHTNESS.get(), 1, 10,
						Effects.JUMP_BOOST, EquipmentSlotType.FEET);
				EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.LIGHTNESS.get(), 2, 10,
						Effects.JUMP_BOOST, EquipmentSlotType.FEET);
				EnchantmentUtils.AddEffectBasedOnLevelEntity(entity, Enchantments.LIGHTNESS.get(), 3, 10,
						Effects.JUMP_BOOST, EquipmentSlotType.FEET);

			}
		}
	}
}
