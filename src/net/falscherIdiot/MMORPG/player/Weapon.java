package net.falscherIdiot.MMORPG.player;

import net.falscherIdiot.MMORPG.util.items.Equipable;
import net.falscherIdiot.MMORPG.util.items.Rarity;
import net.falscherIdiot.MMORPG.util.items.WeaponType;

public class Weapon extends Item implements Equipable {

    private WeaponType weaponType;

    private int level;
    private int durability;

    private int dmg;

    public Weapon(WeaponType weaponType, Rarity rarity, int level, int durability, int dmg, int amount, int price) {
        super(rarity, level, durability, amount, price);
        this.weaponType = weaponType;
        this.level = level;
        this.durability = durability;
        this.dmg = dmg;

    }

    public WeaponType getWeaponType() {
        return weaponType;
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

    public int getDmg() {
        return dmg;
    }

}
