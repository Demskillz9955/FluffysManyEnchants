package com.ManyEnchants.enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import util.EnchantmentUtils;

public class MinersDelightEnchantment extends Enchantment {

	protected MinersDelightEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);

	}

	public boolean isTreasureEnchantment() {
		return false;
	}

	public boolean isCurse() {
		return false;
	}

	public boolean canVillagerTrade() {
		return false;
	}

	public boolean canGenerateInLoot() {
		return false;
	}

	@Override
	public int getMinLevel() {
		return 1;
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean canApply(ItemStack stack) {
		return stack.getItem() instanceof PickaxeItem;

	}

	@Override
	public boolean canApplyTogether(Enchantment ench) {
		return ench != Enchantments.ULTIMINE.get();
	}

	@Override
	public ITextComponent getDisplayName(int level) {
		IFormattableTextComponent iformattabletextcomponent = new TranslationTextComponent(this.getName());
		if (this.isCurse()) {
			iformattabletextcomponent.mergeStyle(TextFormatting.RED);
		} else {
			iformattabletextcomponent.mergeStyle(TextFormatting.GOLD);
		}

		if (level != 1 || this.getMaxLevel() != 1) {
			iformattabletextcomponent.appendString(" ")
					.append(new TranslationTextComponent("enchantment.level." + level));
		}

		return iformattabletextcomponent;
	}

	@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
	public static class MinersDelight {

		static PlayerInventory inventory = null;

		@SubscribeEvent
		public static void Delight(RightClickBlock event) {
			PlayerEntity player = event.getPlayer();
			World worldIn = player.world;

			if (worldIn.getBlockState(event.getPos().down()) != Blocks.AIR.getDefaultState()
					|| worldIn.getBlockState(event.getPos().east()) != Blocks.AIR.getDefaultState()
					|| worldIn.getBlockState(event.getPos().west()) != Blocks.AIR.getDefaultState()
					|| worldIn.getBlockState(event.getPos().north()) != Blocks.AIR.getDefaultState()
					|| worldIn.getBlockState(event.getPos().south()) != Blocks.AIR.getDefaultState()) {

				if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)

						&& EnchantmentHelper.getEnchantmentLevel(Enchantments.MINERS_DELIGHT.get(),
								player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) > 0) {
					if (worldIn.getBlockState(event.getPos().up()) == Blocks.AIR.getDefaultState()) {
						if (worldIn.getBlockState(event.getPos()) != Blocks.TORCH.getDefaultState()) {

							worldIn.setBlockState(event.getPos().up(), Blocks.TORCH.getDefaultState());
							EnchantmentUtils.DamageItemBasedOnEnchantmentLevel(30, player, EquipmentSlotType.MAINHAND,
									Enchantments.MINERS_DELIGHT.get(), 1);
							EnchantmentUtils.DamageItemBasedOnEnchantmentLevel(20, player, EquipmentSlotType.MAINHAND,
									Enchantments.MINERS_DELIGHT.get(), 2);
							EnchantmentUtils.DamageItemBasedOnEnchantmentLevel(15, player, EquipmentSlotType.MAINHAND,
									Enchantments.MINERS_DELIGHT.get(), 3);

						}
					}
				}

			}
		}
	}
}
