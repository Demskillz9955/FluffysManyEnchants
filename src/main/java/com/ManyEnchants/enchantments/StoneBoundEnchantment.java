package com.ManyEnchants.enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class StoneBoundEnchantment extends Enchantment {
	public static float StoneValue = 0.0f;

	protected StoneBoundEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
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
		return StoneValue * level;
	}

	@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
	public static class StoneBound {

		public static void GetPlayerCurrentY(PlayerTickEvent event) {
			PlayerEntity player = event.player;
			if (player.getPosition().getY() == 50) {
				StoneValue = 1.0f;
			} else if (player.getPosition().getY() == 25) {
				StoneValue = 1.5f;
			} else if (player.getPosition().getY() == 20) {
				StoneValue = 2.0f;
			} else if (player.getPosition().getY() == 15) {
				StoneValue = 2.5f;
			} else if (player.getPosition().getY() == 10) {
				StoneValue = 3.0f;
			} else if (player.getPosition().getY() > 50) {
				StoneValue = 0.0f;
			}

		}
	}
}
