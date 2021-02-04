package com.ManyEnchants.enchantments;

import com.ManyEnchants.ManyEnchants;

import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.HandSide;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import util.ItemOverrides;

public class EnrichmentEnchantment extends Enchantment {

	protected EnrichmentEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots) {
		super(rarityIn, typeIn, slots);

	}

	@Override
	public int getMinLevel() {
		return 1;
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}

	@Override
	public boolean canVillagerTrade() {
		return false;
	}

	public boolean isGodEnchantment() {
		return true;
	}

	@Override
	public boolean canGenerateInLoot() {
		return true;
	}

	public boolean canApplyAtEnchantingTable() {
		return false;
	}

	@Override
	public boolean canApply(ItemStack stack) {
		return stack.getItem() instanceof PickaxeItem;

	}

	@Override
	public ITextComponent getDisplayName(int level) {
		IFormattableTextComponent iformattabletextcomponent = new TranslationTextComponent(this.getName());
		if (this.isCurse()) {
			iformattabletextcomponent.mergeStyle(TextFormatting.RED);
		} else {
			iformattabletextcomponent.mergeStyle(TextFormatting.GREEN);
		}

		if (level != 1 || this.getMaxLevel() != 1) {
			iformattabletextcomponent.appendString(" ")
					.append(new TranslationTextComponent("enchantment.level." + level));
		}

		return iformattabletextcomponent;
	}

	@Override
	public boolean canApplyTogether(Enchantment ench) {
		return ench != Enchantments.ULTIMINE.get();
	}

	@Mod.EventBusSubscriber(modid = ManyEnchants.MOD_ID, bus = Bus.FORGE)
	public static class Enrich {
		@SubscribeEvent
		public static void Enrichment(RightClickBlock event) {
			PlayerEntity player = event.getPlayer();
			World worldIn = player.world;
			HandSide hand = player.getPrimaryHand();
			if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)

					&& EnchantmentHelper.getEnchantmentLevel(Enchantments.ENRICHMENT.get(),
							player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 1) {

				if (worldIn.getBlockState(event.getPos()) == Blocks.DIAMOND_ORE.getDefaultState()) {
					worldIn.setBlockState(event.getPos(), Blocks.DIAMOND_BLOCK.getDefaultState());
					player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).damageItem(1, player, (p_220045_0_) -> {
						p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
					});

				}

				if (worldIn.getBlockState(event.getPos()) == Blocks.COAL_ORE.getDefaultState()) {
					worldIn.setBlockState(event.getPos(), Blocks.COAL_BLOCK.getDefaultState());
					player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).damageItem(1, player, (p_220045_0_) -> {
						p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
					});

				}

				if (worldIn.getBlockState(event.getPos()) == Blocks.IRON_ORE.getDefaultState()) {
					worldIn.setBlockState(event.getPos(), Blocks.IRON_BLOCK.getDefaultState());
					player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).damageItem(1, player, (p_220045_0_) -> {
						p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
					});

				}

				if (worldIn.getBlockState(event.getPos()) == Blocks.GOLD_ORE.getDefaultState()) {
					worldIn.setBlockState(event.getPos(), Blocks.GOLD_BLOCK.getDefaultState());
					player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).damageItem(1, player, (p_220045_0_) -> {
						p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
					});

				}

				if (worldIn.getBlockState(event.getPos()) == Blocks.LAPIS_ORE.getDefaultState()) {
					worldIn.setBlockState(event.getPos(), Blocks.LAPIS_BLOCK.getDefaultState());
					player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).damageItem(1, player, (p_220045_0_) -> {
						p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
					});

				}

				if (worldIn.getBlockState(event.getPos()) == Blocks.EMERALD_ORE.getDefaultState()) {
					worldIn.setBlockState(event.getPos(), Blocks.EMERALD_BLOCK.getDefaultState());
					player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).damageItem(1, player, (p_220045_0_) -> {
						p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
					});

				}

				if (worldIn.getBlockState(event.getPos()) == Blocks.REDSTONE_ORE.getDefaultState().getBlockState()) { // currently
																														// needs
																														// some
																														// work
					worldIn.setBlockState(event.getPos(), Blocks.REDSTONE_BLOCK.getDefaultState().getBlockState());
					worldIn.setBlockState(event.getPos(), Blocks.REDSTONE_BLOCK.getDefaultState().getBlockState());
					worldIn.setBlockState(event.getPos(), Blocks.REDSTONE_BLOCK.getDefaultState().getBlockState());
					player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).damageItem(1, player, (p_220045_0_) -> {
						p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
					});

				}

			}

			if (worldIn.getBlockState(event.getPos()) == Blocks.NETHER_QUARTZ_ORE.getDefaultState()) {
				worldIn.setBlockState(event.getPos(), Blocks.QUARTZ_BLOCK.getDefaultState());
				player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).damageItem(1, player, (p_220045_0_) -> {
					p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});

			}

			if (worldIn.getBlockState(event.getPos()) == Blocks.NETHER_GOLD_ORE.getDefaultState()) {
				worldIn.setBlockState(event.getPos(), Blocks.GOLD_BLOCK.getDefaultState());
				player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).damageItem(1, player, (p_220045_0_) -> {
					p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
				});

			}

			if (player.hasItemInSlot(EquipmentSlotType.MAINHAND)

					&& EnchantmentHelper.getEnchantmentLevel(Enchantments.ENRICHMENT.get(),
							player.getItemStackFromSlot(EquipmentSlotType.MAINHAND)) == 2) {
				if (worldIn.getBlockState(event.getPos()) == Blocks.ANCIENT_DEBRIS.getDefaultState()) {
					worldIn.setBlockState(event.getPos(), Blocks.NETHERITE_BLOCK.getDefaultState());
					player.getItemStackFromSlot(EquipmentSlotType.MAINHAND).damageItem(1, player, (p_220045_0_) -> {
						p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
					});

				}

			}
		}

	}
}
