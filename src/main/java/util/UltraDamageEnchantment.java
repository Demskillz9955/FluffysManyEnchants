package util;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.Effect;
import net.minecraft.world.World;

public class UltraDamageEnchantment extends Enchantment {
	public int AdditionalDamgeDealt;

	public UltraDamageEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType[] slots, int damage) {
		super(rarityIn, typeIn, slots);
		this.AdditionalDamgeDealt = damage;

	}

	public int getMaxLevel() {
		return 6;
	}

	public float calcDamageByCreature(int level, CreatureAttribute creatureType) {
		if (this.AdditionalDamgeDealt > 0) {
			return this.AdditionalDamgeDealt;
		}
		return 0.0f;
	}
}
