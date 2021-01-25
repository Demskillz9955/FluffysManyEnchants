package com.ManyEnchants.Enchantments;

import com.ManyEnchants.ManyEnchants;

import UtilStuff.EnchantmentUtils;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
public class GoldenTouchEnchantment{
/*
	protected GoldenTouchEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);
		
	}

	@Override
	public int getMinLevel() {
		return 1;
	}
	
	@Override
	public int getMaxLevel() {
		return 2;
	}
	@Override
	  public boolean canVillagerTrade() {
	      return false;
	   }

	  @Override
	   public boolean canGenerateInLoot() {
	      return true;
	   }
	  public boolean canApplyAtEnchantingTable() {
	      return false;
	  }
	  */
	

		
		
	@SubscribeEvent
	public static void GroundReform(PlayerTickEvent event) {
		PlayerEntity player = event.player;
		World worldIn = player.world;
		
		if (player.hasItemInSlot(EquipmentSlotType.FEET) 
				
				&& EnchantmentHelper.getEnchantmentLevel(Enchantments.GOLDEN_TOUCH.get(),player.getItemStackFromSlot(EquipmentSlotType.FEET)) > 0) {
			
			if(EnchantmentHelper.getEnchantmentLevel(Enchantments.GOLDEN_TOUCH.get(),player.getItemStackFromSlot(EquipmentSlotType.FEET)) == 1) {
				
				EnchantmentUtils.ChangeBlockDown(player, worldIn, Blocks.BEDROCK.getDefaultState(), Blocks.GOLD_BLOCK.getDefaultState());
				
			
				
			}}
			
			if(EnchantmentHelper.getEnchantmentLevel(Enchantments.GOLDEN_TOUCH.get(),player.getItemStackFromSlot(EquipmentSlotType.FEET)) == 2) {
			
						
						
		 {
			
		
			EnchantmentUtils.ChangeBlockDown(player, worldIn, Blocks.BEDROCK.getDefaultState(), Blocks.DIAMOND_BLOCK.getDefaultState());	
			
		}}
		
		

}}
