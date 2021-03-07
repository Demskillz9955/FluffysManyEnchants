package com.ManyEnchants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ManyEnchants.enchantments.CurseEnchantments;
import com.ManyEnchants.enchantments.Enchantments;
import com.ManyEnchants.enchantments.Enchantments2;
import com.ManyEnchants.enchantments.SwiftnessEnchantment;

import net.minecraft.block.Block;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraft.enchantment.LootBonusEnchantment;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.client.settings.KeyModifier;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import util.Config;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("manyenchants")
public class ManyEnchants {
	public static KeyBinding Levitate = new KeyBinding("key.levitate", KeyConflictContext.IN_GAME, KeyModifier.NONE,
			InputMappings.Type.KEYSYM, 16, "key.catagories.manyenchants");
	
	public static final String MOD_ID = "manyenchants";

	private static final Logger LOGGER = LogManager.getLogger();

	public ManyEnchants() {
		 ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.spec);
		ClientRegistry.registerKeyBinding(Levitate);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		Enchantments.init();
		Enchantments2.init();
		CurseEnchantments.init();

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		LOGGER.info("Loading Fluffys Many Enchantments");
		LOGGER.info("Enjoy the mod :)");
	SwiftnessEnchantment.MaxLevel = Config.ENCHANTMENT_LEVELS.speedEnchantmentLevel.get().intValue();
	Enchantments.SlownessLevel = Config.ENCHANTMENT_LEVELS.slownessLevel.get().intValue();
	Enchantments.UndeadLevel = Config.ENCHANTMENT_LEVELS.undeadReviveLevel.get().intValue();
	Enchantments.ViperLevel = Config.ENCHANTMENT_LEVELS.viperLevel.get().intValue();
	Enchantments.WeaknessLevel = Config.ENCHANTMENT_LEVELS.weaknessLevel.get().intValue();
	}

	private void doClientStuff(final FMLClientSetupEvent event) {

	}

	private void enqueueIMC(final InterModEnqueueEvent event) {

	}

	private void processIMC(final InterModProcessEvent event) {

	}

	// You can use SubscribeEvent and let the Event Bus discover methods to call
	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
		LOGGER.info("Loading Fluffys Many Enchantments");
	}

	// You can use EventBusSubscriber to automatically subscribe events on the
	// contained class (this is subscribing to the MOD
	// Event bus for receiving Registry Events)
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
			// register a new block here
			LOGGER.info("HELLO from Register Block");
		}
	}
}
