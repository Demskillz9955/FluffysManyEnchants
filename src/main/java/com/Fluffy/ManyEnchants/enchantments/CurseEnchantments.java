package com.ManyEnchants.enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import util.EnchantmentBase;

public class CurseEnchantments {
	private static final DeferredRegister<Enchantment> ENCHANTMENT = DeferredRegister
			.create(ForgeRegistries.ENCHANTMENTS, ManyEnchants.MOD_ID);

	public static void init() {
		ENCHANTMENT.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	public static RegistryObject<Enchantment> BREAKABLE = ENCHANTMENT.register("breakable",
			() -> new EnchantmentBase(Rarity.COMMON, EnchantmentType.WEAPON, null, 1, 1, true, false, true, true,
					false));
	public static RegistryObject<Enchantment> SLOWNESS = ENCHANTMENT.register("slowness",
			() -> new EnchantmentBase(Rarity.UNCOMMON, EnchantmentType.ARMOR_FEET,
					new EquipmentSlotType[] { EquipmentSlotType.FEET }, 1, 2, true, false, true, true, false));
	public static RegistryObject<Enchantment> BLINDNESS = ENCHANTMENT.register("blindness",
			() -> new EnchantmentBase(Rarity.UNCOMMON, EnchantmentType.ARMOR_HEAD,
					new EquipmentSlotType[] { EquipmentSlotType.HEAD }, 1, 3, true, false, true, true, false));
}
