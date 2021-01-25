package com.ManyEnchants.Enchantments;

import com.ManyEnchants.ManyEnchants;

import UtilStuff.EnchantmentUtils;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.EntityLeaveWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class SoulSeekerEnchantment extends Enchantment{

	protected SoulSeekerEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);
		
	}

	@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
	public static class SoulSeeking{
/*		
		private static int SoulsSeeked = 0;
		private static boolean IsSeekingSouls = false;
		
		@SubscribeEvent
		public static void SoulSeeker(LivingDeathEvent event) {
	DamageSource source = event.getSource();
	LivingEntity player = event.getEntityLiving();
			 if(source.getTrueSource().getEntity().isLiving() == true) {
				if(player.hasItemInSlot(EquipmentSlotType.MAINHAND) 
						
						&& EnchantmentHelper.getEnchantmentLevel(Enchantments.SOUL_SEEKER.get(),player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) > 0) {
					System.out.println("its working");
				}
			}
			
			}
		}
		
		public static void Seek() {
		PlayerEntity player = null;
		EnchantmentUtils.EffectAddPLayer(player, null, Effects.STRENGTH, 100, 2);
	*/
		}
		}
			
	
		
		
		
	
	
	

