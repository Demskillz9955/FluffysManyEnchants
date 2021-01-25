package UtilStuff;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.loot.conditions.WeatherCheck;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class EnchantmentAddEffect extends Enchantment{
	private boolean Curse;
	private boolean VillagerTrade;
	private boolean IsTreasure;
	private boolean CanGenInLoot;
	private boolean ApplyAtEnchant;
	private int MinLevel;
	private int MaxLevel;
	
	public EnchantmentAddEffect(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots,int minLevel, int maxLevel, boolean curse, boolean villagerTrade, boolean isTreasure, boolean genInLoot, boolean applyAtEnchant) {
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
			   
			   public void onEntityDamaged(LivingEntity user, Entity target, int level) {
				
				      if (target instanceof LivingEntity) {
				         LivingEntity livingentity = (LivingEntity)target;
				         if (livingentity.getCreatureAttribute() == CreatureAttribute.UNDEFINED) {
				        	 EnchantmentUtils.EffectAddEntity(livingentity, null, Effects.LEVITATION, 100, 1, false, false);
				          
				         }
				      }
			   }
}
