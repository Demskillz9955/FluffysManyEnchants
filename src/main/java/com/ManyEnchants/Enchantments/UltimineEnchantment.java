package com.ManyEnchants.Enchantments;


import com.ManyEnchants.ManyEnchants;

import UtilStuff.ItemOverrides;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.world.Explosion.Mode;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class UltimineEnchantment extends Enchantment{

	protected UltimineEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);
		
	}
	
	@Override 
	public int getMinLevel() {
		return 1;
	}
	@Override 
	public int getMaxLevel() {
		return 4;
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
	@Override
	  public boolean canApply(ItemStack stack) {
		  return stack.getItem() instanceof PickaxeItem; 
		  
	  }
	  
	@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
	public static class Explode{
		
		@SubscribeEvent
		public static void Explosion(RightClickBlock event) {
			PlayerEntity player = event.getPlayer();
			World worldIn = player.world;
		
		 if(player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).getItem() != Items.DIAMOND_HOE || player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).getItem() != Items.GOLDEN_HOE ||
				 player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).getItem() != Items.IRON_HOE || player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).getItem() != Items.NETHERITE_HOE || player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).getItem() != Items.STONE_HOE || player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).getItem() != Items.WOODEN_HOE)	{
			if (player.hasItemInSlot(EquipmentSlotType.MAINHAND) 
					
					&& EnchantmentHelper.getEnchantmentLevel(Enchantments.ULTIMINE.get(),player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 1) {
			
				player.getItemStackFromSlot(EquipmentSlotType.FEET).damageItem(1, player,(p_220045_0_) -> {
					   p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});
			worldIn.createExplosion(player, player.getPosition().getX(),  player.getPosition().getY() + 1,  player.getPosition().getZ(), 1f, Mode.BREAK);
		}
		
		if(player.hasItemInSlot(EquipmentSlotType.MAINHAND) 
				
				&& EnchantmentHelper.getEnchantmentLevel(Enchantments.ULTIMINE.get(),player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 2) {
		
			player.getItemStackFromSlot(EquipmentSlotType.FEET).damageItem(1, player,(p_220045_0_) -> {
				   p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
			});
		worldIn.createExplosion(player, player.getPosition().getX(),  player.getPosition().getY() + 1,  player.getPosition().getZ(), 2.5f, Mode.BREAK);
	}
if(player.hasItemInSlot(EquipmentSlotType.MAINHAND) 
				
				&& EnchantmentHelper.getEnchantmentLevel(Enchantments.ULTIMINE.get(),player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 3) {
		
	player.getItemStackFromSlot(EquipmentSlotType.FEET).damageItem(1, player,(p_220045_0_) -> {
		   p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
	});
		worldIn.createExplosion(player, player.getPosition().getX(),  player.getPosition().getY() + 1,  player.getPosition().getZ(), 4, Mode.BREAK);
}
if(player.hasItemInSlot(EquipmentSlotType.MAINHAND) 
				
				&& EnchantmentHelper.getEnchantmentLevel(Enchantments.ULTIMINE.get(),player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 4) {
	player.getItemStackFromSlot(EquipmentSlotType.FEET).damageItem(1, player,(p_220045_0_) -> {
		   p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
	});
		worldIn.createExplosion(player, player.getPosition().getX(),  player.getPosition().getY() + 1,  player.getPosition().getZ(), 5.5f, Mode.BREAK);
	}}
		}
}}
