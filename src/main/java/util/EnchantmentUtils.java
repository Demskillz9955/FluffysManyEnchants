package util;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.Explosion.Mode;
import net.minecraft.world.storage.IWorldInfo;
import net.minecraft.world.storage.ServerWorldInfo;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class EnchantmentUtils {

	public static void EffectAddPLayer(PlayerEntity player, World worldIn, Effect effect, int effectTime,
			int effectLevel) {

		player.addPotionEffect(new EffectInstance(effect, effectTime, effectLevel));
	}

	public static void SummonStorm(World worldIn) {
		ServerWorldInfo IworldIn = null;
		IworldIn.getServerWorldInfo().setThundering(true);

	}

	public static void EffectAddEntity(LivingEntity entity, World worldIn, Effect effect, int effectTime,
			int effectLevel, boolean particles, boolean shown) {
		entity.addPotionEffect(new EffectInstance(effect, effectTime, effectLevel, particles, shown));
	}

	public static void AddEffectBasedOnLevel(PlayerEntity player, Enchantment enchant, int enchantTime,
			int enchantLevel, Effect effect, EquipmentSlotType type) {
		if (player.hasItemInSlot(type)
				&& EnchantmentHelper.getEnchantmentLevel(enchant, player.getItemStackFromSlot(type)) == enchantLevel) {
			player.addPotionEffect(new EffectInstance(effect, enchantTime, enchantLevel * 2, false, false, false));

		}
	}

	public static void AddEffectBasedOnLevelEntity(LivingEntity player, Enchantment enchant, int enchantTime,
			int enchantLevel, Effect effect, EquipmentSlotType type) {
		if (player.hasItemInSlot(type)
				&& EnchantmentHelper.getEnchantmentLevel(enchant, player.getItemStackFromSlot(type)) == enchantLevel) {
			player.addPotionEffect(new EffectInstance(effect, enchantTime, enchantLevel * 2, false, false, false));

		}
	}

	public static void CreateExplosionEntityLiving(LivingEntity entity, World worldIn, float size, Mode modeIn) {
		worldIn.createExplosion(entity, entity.getPosition().getX(), entity.getPosition().getY(),
				entity.getPosition().getZ(), size, modeIn);
	}

	public static boolean RandomAction() {
		int randomInt = (int) (10.0 * Math.random());
		if (randomInt > 5) {
			return true;
		} else {
			return false;
		}

	}

	public static void ChangeBlockDown(PlayerEntity player, World worldIn, BlockState blockToFind,
			BlockState blockToReplace) {

		if (worldIn.getBlockState(player.getPosition().down()) != Blocks.AIR.getDefaultState()
				&& worldIn.getBlockState(player.getPosition().down()) != blockToFind) {
			worldIn.setBlockState(player.getPosition().down(), blockToReplace);
		}
		;

	}

	public static boolean getBlockDownAir(PlayerEntity player, World worldIn) {
		if (worldIn.getBlockState(player.getPosition().down()) == Blocks.AIR.getDefaultState()) {
			return true;
		} else {
			return false;

		}
	}

	public static void ChangeItemInHandMain(PlayerEntity player, World worldIn, ItemStack stack,
			EquipmentSlotType type) {

	}// currently does nothing

	public static void DamageItemInHand(PlayerEntity player, World worldIn, EquipmentSlotType type, int damageAmount) {

		player.getItemStackFromSlot(type).damageItem(damageAmount, player, (p_220045_0_) -> {
			p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		});
	}

	public static void DamageItemInHandEntity(LivingEntity player, World worldIn, EquipmentSlotType type,
			int damageAmount) {

		player.getItemStackFromSlot(type).damageItem(damageAmount, player, (p_220045_0_) -> {
			p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		});
	}

	public static void DamageItemBasedOnEnchantmentLevel(int damageamount, PlayerEntity player, EquipmentSlotType type,
			Enchantment enchantment, int enchantmentlevel) {
		if (player.hasItemInSlot(type) && EnchantmentHelper.getEnchantmentLevel(enchantment,
				player.getItemStackFromSlot(type)) == enchantmentlevel) {
			player.getItemStackFromSlot(type).damageItem(damageamount, player, (p_220045_0_) -> {
				p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
			});
		}
	}

	public static void Heal(PlayerEntity player, float healAmount, float MinimumHealthHeal) {
		if (player.getHealth() >= MinimumHealthHeal) {
			player.heal(healAmount);
		}
	}

	public void HealBasedOnDamage(PlayerEntity player, World worldIn, float damageDealt) {
		player.heal(damageDealt);

	}

	public int EnchantLevelMulti(int level) {
		if (level == 1) {
			return 1;
		} else if (level == 2) {
			return 2;
		} else if (level == 3) {
			return 3;
		} else if (level == 4) {
			return 4;
		} else if (level == 5) {
			return 5;
		} else if (level == 6) {
			return 6;
		} else {
			return level;
		}
	}

	public void removeEffects(LivingEntity entity, Effect effect) {
		entity.removeActivePotionEffect(effect);
	}

}