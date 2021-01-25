package com.ManyEnchants.Enchantments;

import com.ManyEnchants.ManyEnchants;

import UtilStuff.EnchantmentUtils;
import net.minecraft.enchantment.FireAspectEnchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
public class HasteEnchantment{


@SubscribeEvent
	public static void Haste(PlayerTickEvent event) {
	PlayerEntity player = event.player;	
	
	EnchantmentUtils.AddEffectBasedOnLevel(player, Enchantments.HASTE.get(), 10, 1, Effects.HASTE, EquipmentSlotType.MAINHAND);
	EnchantmentUtils.AddEffectBasedOnLevel(player, Enchantments.HASTE.get(), 10, 2, Effects.HASTE, EquipmentSlotType.MAINHAND);
	EnchantmentUtils.AddEffectBasedOnLevel(player, Enchantments.HASTE.get(), 10, 3, Effects.HASTE, EquipmentSlotType.MAINHAND);
	
	}
}
