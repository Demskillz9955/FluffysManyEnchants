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
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class VisionEnchantment extends Enchantment {

	protected VisionEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
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

	@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
	public static class Vision {

		@SubscribeEvent
		public static void NightVision(LivingUpdateEvent event) {
			LivingEntity entity = event.getEntityLiving();
			World worldIn = entity.world;
			if (entity.hasItemInSlot(EquipmentSlotType.HEAD)

					&& EnchantmentHelper.getEnchantmentLevel(Enchantments.VISION.get(),
							entity.getItemStackFromSlot(EquipmentSlotType.HEAD)) > 0) {
				entity.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 100, 0, false, false));
			}
		}

	}
}
