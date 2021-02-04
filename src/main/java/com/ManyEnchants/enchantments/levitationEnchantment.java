package com.ManyEnchants.enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import util.EnchantmentUtils;

public class levitationEnchantment extends Enchantment{

	protected levitationEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
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
	      return false;
	   }

	  @Override
	   public boolean canGenerateInLoot() {
	      return false;
	   }
	  public boolean canApplyAtEnchantingTable() {
	      return true;
	  }
	  @Override
	  public ITextComponent getDisplayName(int level) {
	      IFormattableTextComponent iformattabletextcomponent = new TranslationTextComponent(this.getName());
	      if (this.isCurse()) {
	         iformattabletextcomponent.mergeStyle(TextFormatting.RED);
	      } else {
	         iformattabletextcomponent.mergeStyle(TextFormatting.BLUE);
	      }

	      if (level != 1 || this.getMaxLevel() != 1) {
	         iformattabletextcomponent.appendString(" ").append(new TranslationTextComponent("enchantment.level." + level));
	      }

	      return iformattabletextcomponent;
	   }
	@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
	public static class Levitate{




		@SubscribeEvent
		public static void Explosion(PlayerTickEvent event) {
			PlayerEntity player = event.player;
			World worldIn = player.world;
	if (player.hasItemInSlot(EquipmentSlotType.FEET) 
					
					&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LEVITATION.get(),player.getItemStackFromSlot(EquipmentSlotType.FEET)) > 0) {
		
		if(ManyEnchants.Levitate.isKeyDown() == true){
				
				if (player.hasItemInSlot(EquipmentSlotType.FEET) 
						
						&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LEVITATION.get(),player.getItemStackFromSlot(EquipmentSlotType.FEET)) == 1) {
				player.addPotionEffect(new EffectInstance(Effects.LEVITATION, 1,10));}
if (player.hasItemInSlot(EquipmentSlotType.FEET) 
						
						&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LEVITATION.get(),player.getItemStackFromSlot(EquipmentSlotType.FEET)) == 2) {
				player.addPotionEffect(new EffectInstance(Effects.LEVITATION, 2,10));}
if (player.hasItemInSlot(EquipmentSlotType.FEET) 
		
		&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LEVITATION.get(),player.getItemStackFromSlot(EquipmentSlotType.FEET)) == 3) {
player.addPotionEffect(new EffectInstance(Effects.LEVITATION, 3,10));}
if (player.hasItemInSlot(EquipmentSlotType.FEET) 
		
		&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LEVITATION.get(),player.getItemStackFromSlot(EquipmentSlotType.FEET)) == 4) {
player.addPotionEffect(new EffectInstance(Effects.LEVITATION, 4,10));}
if (player.hasItemInSlot(EquipmentSlotType.FEET) 
		
		&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LEVITATION.get(),player.getItemStackFromSlot(EquipmentSlotType.FEET)) == 5) {
player.addPotionEffect(new EffectInstance(Effects.LEVITATION, 5,10));}
if (player.hasItemInSlot(EquipmentSlotType.FEET) 
		
		&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LEVITATION.get(),player.getItemStackFromSlot(EquipmentSlotType.FEET)) == 6) {
player.addPotionEffect(new EffectInstance(Effects.LEVITATION, 6,10));}
		/*EnchantmentUtils.AddEffectBasedOnLevel(player, Enchantments.LEVITATION.get(), 1,100, Effects.LEVITATION, EquipmentSlotType.FEET);
		EnchantmentUtils.AddEffectBasedOnLevel(player, Enchantments.LEVITATION.get(), 2,100, Effects.LEVITATION, EquipmentSlotType.FEET);
		EnchantmentUtils.AddEffectBasedOnLevel(player, Enchantments.LEVITATION.get(), 3,100, Effects.LEVITATION, EquipmentSlotType.FEET);
		EnchantmentUtils.AddEffectBasedOnLevel(player, Enchantments.LEVITATION.get(), 4,100, Effects.LEVITATION, EquipmentSlotType.FEET);
		EnchantmentUtils.AddEffectBasedOnLevel(player, Enchantments.LEVITATION.get(), 5,100, Effects.LEVITATION, EquipmentSlotType.FEET);
		EnchantmentUtils.AddEffectBasedOnLevel(player, Enchantments.LEVITATION.get(), 6,100, Effects.LEVITATION, EquipmentSlotType.FEET);*/
			System.out.println("working");
			EnchantmentUtils.DamageItemInHand(player, worldIn, EquipmentSlotType.FEET, 1);
		}else {
		
			player.removePotionEffect(Effects.LEVITATION);
		
	}
	}
	
}}}
