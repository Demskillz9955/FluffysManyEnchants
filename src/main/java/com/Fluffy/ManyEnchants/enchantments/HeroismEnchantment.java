package com.ManyEnchants.enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import util.EnchantmentUtils;

public class HeroismEnchantment extends Enchantment {

	protected HeroismEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
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

	public float calcDamageByCreature(int level, CreatureAttribute creatureType) {
		return 10.0F;
	}

	@Override
	public boolean canGenerateInLoot() {
		return true;
	}

	public boolean canApplyAtEnchantingTable() {
		return false;
	}

	@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
	public static class Heroism {
		@SubscribeEvent
		public static void heroism(PlayerTickEvent event) {
			PlayerEntity player = event.player;
			if (player.hasItemInSlot(EquipmentSlotType.CHEST)
					&& EnchantmentHelper.getEnchantmentLevel(Enchantments.HEROISM.get(),
							player.getItemStackFromSlot(EquipmentSlotType.CHEST)) > 0) {

				EnchantmentUtils.EffectAddPLayer(player, null, Effects.HERO_OF_THE_VILLAGE, 10, 1);

			}
		}
	}
}
