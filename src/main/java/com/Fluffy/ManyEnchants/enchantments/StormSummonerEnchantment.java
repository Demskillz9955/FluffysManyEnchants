package com.ManyEnchants.enchantments;

import java.io.IOException;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.Effects;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.IServerWorldInfo;
import net.minecraft.world.storage.IWorldInfo;
import net.minecraft.world.storage.ServerWorldInfo;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import util.EnchantmentUtils;

public class StormSummonerEnchantment extends Enchantment {

	protected StormSummonerEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
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

	@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
	public static class Storms {

		@SubscribeEvent
		public static void StormSummoner(RightClickBlock event) {// Currently does not work
			PlayerEntity player = event.getPlayer();
			World worldIn = player.getEntityWorld();

			/*
			 * if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)
			 * 
			 * &&
			 * EnchantmentHelper.getEnchantmentLevel(Enchantments.SUMMONER_OF_THE_STORMS.get
			 * (),player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) > 0) {
			 * 
			 * 
			 * 
			 *  //unused for rn because of server crashes
			 * 
			 * 
			 * 
			 * 
			 * 
			 * } }
			 * 
			 * 
			 * 
			 * 
			 * } public static ServerWorldInfo getServerWorldInfo(ServerWorldInfo info) {
			 * return info; }
			 */
		}
	}
}
