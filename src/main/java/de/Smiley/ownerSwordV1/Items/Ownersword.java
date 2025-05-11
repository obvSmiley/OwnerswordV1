package de.Smiley.ownerSwordV1.Items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Ownersword {
    public static ItemStack get() {
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§4§lOwnerSword");
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attackdamage", 9999,AttributeModifier.Operation.ADD_NUMBER));
meta.getEnchantLevel(Enchantment.SHARPNESS);

        item.setItemMeta(meta);
        return item;
    }
}
