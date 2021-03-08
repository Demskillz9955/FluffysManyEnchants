package util;

import com.ManyEnchants.ManyEnchants;
import com.ManyEnchants.enchantments.CurseEnchantments;
import com.ManyEnchants.enchantments.Enchantments;
import com.ManyEnchants.enchantments.Enchantments2;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
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
	public static void Breakable(AttackEntityEvent event) {
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
	public static void otherTicks(PlayerTickEvent event) {
		ItemStack stack = null;
		PlayerEntity player = event.player;
		EquipmentSlotType[] type = new EquipmentSlotType[] { EquipmentSlotType.FEET, EquipmentSlotType.LEGS, EquipmentSlotType.CHEST, EquipmentSlotType.HEAD };
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
	/*	if (player.hasItemInSlot(EquipmentSlotType.FEET)
				&& EnchantmentHelper.getEnchantmentLevel(Enchantments2.CURSE_NULLIFIER.get(),
						player.getItemStackFromSlot(EquipmentSlotType.FEET)) >= 0) {
*/
		
	}
	@SubscribeEvent
	public static void deFest(RightClickBlock event) {
		PlayerEntity player = event.getPlayer();
		World world = player.world;
		
		Block[] infestedBlocks = {Blocks.INFESTED_STONE};
		
		BlockPos pos = event.getPos();
		if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)
				&& EnchantmentHelper.getEnchantmentLevel(Enchantments2.DE_FESTER.get(),
						player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) >= 0) {
		if(world.getBlockState(pos)== Blocks.INFESTED_STONE.getDefaultState()) {
			EnchantmentUtils.DamageItemInHand(player, world, EquipmentSlotType.MAINHAND, 10);
			world.setBlockState(pos, Blocks.STONE.getDefaultState());
		}
	}
	}
	
}
