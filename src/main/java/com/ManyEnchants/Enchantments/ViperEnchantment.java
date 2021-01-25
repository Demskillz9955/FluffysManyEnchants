package com.ManyEnchants.Enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.biome.Biomes;

public class ViperEnchantment extends Enchantment {

	protected ViperEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);
		// TODO Auto-generated constructor stub
	}
	public float calcDamageByCreature(int level, CreatureAttribute creatureType) {
		PlayerEntity player = null;
		World worldIn = player.world;
	
		BiomeManager biome = worldIn.getBiomeManager();
			
		if(worldIn.getBiomeManager().getBiomeAtPosition(player.getPosition()).getCategory().DESERT == biome.getBiome(player.getPosition()).getCategory().DESERT) {
			return 4;
		}
		return 0;
	}
}
