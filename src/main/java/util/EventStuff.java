package util;

import com.ManyEnchants.ManyEnchants;
import com.ManyEnchants.enchantments.CurseEnchantments;
import com.ManyEnchants.enchantments.Enchantments;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
public class EventStuff {

	@SubscribeEvent
	public static void TakeHealth(AttackEntityEvent event) {
		PlayerEntity player = event.getPlayer();
		Entity target = event.getTarget();

		if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)

				&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LIFE_STEAL.get(),
						player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 1) {

			EnchantmentUtils.Heal(player, 5, 6.5f);
		}
		if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)

				&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LIFE_STEAL.get(),
						player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 2) {

			EnchantmentUtils.Heal(player, 5, 7f);
		}
		if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)

				&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LIFE_STEAL.get(),
						player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 3) {

			EnchantmentUtils.Heal(player, 5, 7.5f);
		}
		if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)

				&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LIFE_STEAL.get(),
						player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 4) {

			EnchantmentUtils.Heal(player, 5, 8.5f);
		}
		if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)

				&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LIFE_STEAL.get(),
						player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 5) {

			EnchantmentUtils.Heal(player, 5, 9f);
		}
		if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)

				&& EnchantmentHelper.getEnchantmentLevel(Enchantments.LIFE_STEAL.get(),
						player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 6) {

			EnchantmentUtils.Heal(player, 5, 9.5f);
		}

	}

	@SubscribeEvent
	public static void Breakable(LivingAttackEvent event) {
		LivingEntity player = event.getEntityLiving();
		if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)
				&& EnchantmentHelper.getEnchantmentLevel(CurseEnchantments.BREAKABLE.get(),
						player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) >= 0) {
			if (player.getHeldItemMainhand().isDamageable() == true) {
				EnchantmentUtils.DamageItemInHandEntity(player, null, EquipmentSlotType.MAINHAND, 200);
			}

		}
	}

	@SubscribeEvent
	public static void breakable(PlayerTickEvent event) {

		PlayerEntity player = event.player;

		if (player.hasItemInSlot(EquipmentSlotType.FEET)
				&& EnchantmentHelper.getEnchantmentLevel(CurseEnchantments.SLOWNESS.get(),
						player.getItemStackFromSlot(EquipmentSlotType.FEET)) >= 0) {
			EnchantmentUtils.AddEffectBasedOnLevel(player, CurseEnchantments.SLOWNESS.get(), 1, 1, Effects.SLOWNESS,
					EquipmentSlotType.FEET);
			EnchantmentUtils.AddEffectBasedOnLevel(player, CurseEnchantments.SLOWNESS.get(), 2, 2, Effects.SLOWNESS,
					EquipmentSlotType.FEET);

		}
		if (player.hasItemInSlot(EquipmentSlotType.HEAD)
				&& EnchantmentHelper.getEnchantmentLevel(CurseEnchantments.BLINDNESS.get(),
						player.getItemStackFromSlot(EquipmentSlotType.FEET)) >= 0) {
			EnchantmentUtils.AddEffectBasedOnLevel(player, CurseEnchantments.BLINDNESS.get(), 1, 1, Effects.BLINDNESS,
					EquipmentSlotType.HEAD);
			EnchantmentUtils.AddEffectBasedOnLevel(player, CurseEnchantments.BLINDNESS.get(), 2, 2, Effects.BLINDNESS,
					EquipmentSlotType.HEAD);
			EnchantmentUtils.AddEffectBasedOnLevel(player, CurseEnchantments.BLINDNESS.get(), 3, 3, Effects.BLINDNESS,
					EquipmentSlotType.HEAD);

		}
	}
}
