package net.falscherIdiot.MMORPG.player;

import net.falscherIdiot.MMORPG.util.items.ArmorType;
import net.falscherIdiot.MMORPG.util.items.Equipable;
import net.falscherIdiot.MMORPG.util.items.Rarity;

public class Armor extends Item implements Equipable {

    private ArmorType armorType;

    private int level;
    private int durability;

    public Armor(ArmorType armorType, Rarity rarity, int level, int durability, int amount, int price) {
        super(rarity, level, durability, amount, price);
        this.level = level;
        this.durability = durability;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public void setDurability(int durability) {
        this.durability = durability;
    }

}
