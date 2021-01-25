package UtilStuff;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class EnchantmentBase extends Enchantment{

	private boolean Curse;
	private boolean VillagerTrade;
	private boolean IsTreasure;
	private boolean CanGenInLoot;
	private boolean ApplyAtEnchant;
	private int MinLevel;
	private int MaxLevel;
	
	public EnchantmentBase(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots,int minLevel, int maxLevel, boolean curse, boolean villagerTrade, boolean isTreasure, boolean genInLoot, boolean applyAtEnchant) {
		super(rarityIn, typeIn, slots);
		this.Curse = curse;
		this.CanGenInLoot = genInLoot;
		this.IsTreasure = isTreasure;
		this.VillagerTrade = villagerTrade;
		this.ApplyAtEnchant = applyAtEnchant;
		this.MinLevel = minLevel;
		this.MaxLevel = maxLevel;
	}
	 public boolean isTreasureEnchantment() {
	      return IsTreasure;
	   }

	   public boolean isCurse() {
	      return Curse;
	   }
	   public boolean canVillagerTrade() {
		      return VillagerTrade;
		   }

		  
		   public boolean canGenerateInLoot() {
		      return CanGenInLoot;
		   }
		   public int getMinLevel() {
			      return MinLevel;
			   }
			   public int getMaxLevel() {
			      return MaxLevel;
			   }
}
