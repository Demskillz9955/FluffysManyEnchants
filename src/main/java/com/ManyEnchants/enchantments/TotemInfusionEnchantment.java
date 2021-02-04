package com.ManyEnchants.enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class TotemInfusionEnchantment extends Enchantment {

	protected TotemInfusionEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);

	}
	/*
	 * @Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE) public
	 * static class Infusion{
	 * 
	 * @SubscribeEvent public static void Infused(PlayerTickEvent event) { //cool idea don't now how to execute
	 * PlayerEntity player = event.player; if
	 * (player.hasItemInSlot(EquipmentSlotType.CHEST) &&
	 * EnchantmentHelper.getEnchantmentLevel(Enchantments.TOTEM_INFUSION.get(),
	 * player.getItemStackFromSlot(EquipmentSlotType.CHEST)) > 0) {
	 * if(player.getHealth() < 2) { player.revive(); } }
	 */
}
