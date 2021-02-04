package com.ManyEnchants.enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import util.EnchantmentAddEffect;
import util.EnchantmentBase;
import util.UltraDamageEnchantment;

public class Enchantments {
	private static final DeferredRegister<Enchantment> ENCHANTMENT = DeferredRegister
			.create(ForgeRegistries.ENCHANTMENTS, ManyEnchants.MOD_ID);

	public static void init() {
		ENCHANTMENT.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	// curse, villager trade, treasure, genInLoot, EnchantingTable
	public static RegistryObject<Enchantment> GOLDEN_TOUCH = ENCHANTMENT.register("golden_touch",
			() -> new EnchantmentBase(Rarity.VERY_RARE, EnchantmentType.ARMOR_FEET,
					new EquipmentSlotType[] { EquipmentSlotType.FEET }, 1, 2, false, false, false, true, false));
	
	
	public static RegistryObject<Enchantment> ULTIMINE = ENCHANTMENT.register("ultimine",
			() -> new EnchantmentBase(Rarity.RARE, EnchantmentType.DIGGER, null, 1, 4, false, true, false, true, true));
	
	
	public static RegistryObject<Enchantment> VISION = ENCHANTMENT.register("vision",
			() -> new VisionEnchantment(Rarity.UNCOMMON, EnchantmentType.ARMOR_HEAD,
					new EquipmentSlotType[] { EquipmentSlotType.HEAD }));
	
	
	public static RegistryObject<Enchantment> LEVITATION = ENCHANTMENT.register("levitation",
			() -> new levitationEnchantment(Rarity.VERY_RARE, EnchantmentType.ARMOR_FEET,
					new EquipmentSlotType[] { EquipmentSlotType.FEET }));
	
	
	public static RegistryObject<Enchantment> BATTLE_SENSES = ENCHANTMENT.register("battle_senses",
			() -> new BattleSensesEnchantment(Rarity.COMMON, EnchantmentType.ARMOR_CHEST,
					new EquipmentSlotType[] { EquipmentSlotType.CHEST }));
	
	
	public static RegistryObject<Enchantment> SWIFTNESS = ENCHANTMENT.register("swiftness",
			() -> new SwiftnessEnchantment(Rarity.UNCOMMON, EnchantmentType.ARMOR_LEGS,
					new EquipmentSlotType[] { EquipmentSlotType.LEGS }));
	
	
	public static RegistryObject<Enchantment> LIGHTNESS = ENCHANTMENT.register("lightness",
			() -> new LightnessEnchantment(Rarity.COMMON, EnchantmentType.ARMOR_FEET,
					new EquipmentSlotType[] { EquipmentSlotType.FEET }));
	
	
	public static RegistryObject<Enchantment> ENRICHMENT = ENCHANTMENT.register("enrichment",
			() -> new EnrichmentEnchantment(Rarity.VERY_RARE, EnchantmentType.DIGGER, null));
	// public static RegistryObject<Enchantment> SOUL_SEEKER =
	// ENCHANTMENT.register("soul_seeker", () -> new
	// SoulSeekerEnchantment(Rarity.VERY_RARE, EnchantmentType.WEAPON, null));//wip
	public static RegistryObject<Enchantment> HEALTH = ENCHANTMENT.register("health",
			() -> new HealthEnchantment(Rarity.RARE, EnchantmentType.ARMOR_CHEST,
					new EquipmentSlotType[] { EquipmentSlotType.CHEST }));
	
	
	public static RegistryObject<Enchantment> LEVITATOR = ENCHANTMENT.register("levitator",
			() -> new EnchantmentAddEffect(Rarity.VERY_RARE, EnchantmentType.WEAPON, null, 1, 1, false, true, true,
					true, true));
	
	
	public static RegistryObject<Enchantment> HEROISM = ENCHANTMENT.register("heroism",
			() -> new HeroismEnchantment(Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST,
					new EquipmentSlotType[] { EquipmentSlotType.CHEST }));
	// public static RegistryObject<Enchantment> TOTEM_INFUSION =
	// ENCHANTMENT.register("totem_infusion", () -> new
	// TotemInfusionEnchantment(Rarity.VERY_RARE, EnchantmentType.ARMOR_CHEST, new
	// EquipmentSlotType[] { EquipmentSlotType.CHEST}));
	public static RegistryObject<Enchantment> SUPER_SHARPNESS = ENCHANTMENT.register("super_sharpness",
			() -> new UltraDamageEnchantment(Rarity.COMMON, EnchantmentType.WEAPON, null, 2));
	
	
	public static RegistryObject<Enchantment> DOLPHIN_BLESSED = ENCHANTMENT.register("dolphin_blessed",
			() -> new DolphinBlessedEnchantment(Rarity.COMMON, EnchantmentType.ARMOR_FEET,
					new EquipmentSlotType[] { EquipmentSlotType.FEET }));
	
	
	public static RegistryObject<Enchantment> ULTRA_SHARPNESS = ENCHANTMENT.register("ultra_sharpness",
			() -> new UltraDamageEnchantment(Rarity.COMMON, EnchantmentType.WEAPON, null, 4));
	
	
	public static RegistryObject<Enchantment> HASTE = ENCHANTMENT.register("haste",
			() -> new EnchantmentBase(Rarity.RARE, EnchantmentType.DIGGER, null, 1, 3, false, true, true, true, true));
	// public static RegistryObject<Enchantment> SUMMONER_OF_THE_STORMS =
	// ENCHANTMENT.register("storm_summoner", () -> new
	// StormSummonerEnchantment(Rarity.VERY_RARE, EnchantmentType.WEAPON,
	// null));//wip
	public static RegistryObject<Enchantment> SKY_FIGHTER = ENCHANTMENT.register("sky_fighter",
			() -> new SkyFighterEnchantment(Rarity.RARE, EnchantmentType.WEAPON, null));
	
	
	public static RegistryObject<Enchantment> EARTHEN = ENCHANTMENT.register("earthen",
			() -> new EarthenEnchantment(Rarity.UNCOMMON, EnchantmentType.WEAPON, null));
	
	
	public static RegistryObject<Enchantment> STONE_BOUND = ENCHANTMENT.register("stone_bound",
			() -> new StoneBoundEnchantment(Rarity.UNCOMMON, EnchantmentType.WEAPON, null));
	
	
	public static RegistryObject<Enchantment> MINERS_DELIGHT = ENCHANTMENT.register("miners_delight",
			() -> new MinersDelightEnchantment(Rarity.RARE, EnchantmentType.DIGGER, null));
	
	
	public static RegistryObject<Enchantment> LIFE_STEAL = ENCHANTMENT.register("life_steal",
			() -> new EnchantmentBase(Rarity.VERY_RARE, EnchantmentType.WEAPON, null, 1, 6, false, true, true, true,
					true));

}
