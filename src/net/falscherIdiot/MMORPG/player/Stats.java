package net.falscherIdiot.MMORPG.player;

import net.falscherIdiot.MMORPG.util.items.Rarity;
import net.falscherIdiot.MMORPG.util.items.WeaponType;

public class Stats {

    /*----------------------- Player --------------------------*/
    private String username;
    private int emeralds;

    /*----------------------- Stats --------------------------*/
    private int maxHealth;
    private int armor;
    private int healthRegen;
    private int dmg;
    private int critChance; // max: 70%
    private int critDamage; // max: 200%
    private int maxShield;
    private int damageMultiplier; // max: 40%
    private int defenceMultiplier; // max: 40%
    private int shieldMultiplier; // max: 40%
    private int healingMultiplier; // max: 100%
    private int g1dmg;
    private int g2dmg;

    /*----------------------- Levels --------------------------*/
    private int level;
    private int exp; // EXP:[----------](63/17724)
    private int miningSkill;// EXP:[----------](766/8378)
    private int brewingSkill;// EXP:[|||||||||-](6093/6094)
    private int craftingSkill;// EXP:[----------](174/8378)
    private int fightingSkill;// EXP:[|||||||||-](14528/14529)
    private int adventureSkill;// EXP:[|||||||||-](14528/14529)

    /*----------------------- Equipped --------------------------*/
    private Weapon primaryWeapon;
    private Weapon secondaryWeapon;
    private Armor helmet;
    private Armor chestplate;
    private Armor leggins;
    private Armor boots;

    /*----------------------- Inventory --------------------------*/
    private Item[] items;

    private String status;
    private String location;

    public Stats(String username) {
        /*----------------------- Player --------------------------*/
        this.username = username;
        this.emeralds = 0;

        /*----------------------- Stats --------------------------*/
        this.maxHealth = 20;
        this.armor = 0;
        this.healthRegen = 0;
        this.dmg = 1;
        this.critChance = 0;
        this.critDamage = 0;
        this.maxShield = 0;
        this.damageMultiplier = 1;
        this.defenceMultiplier = 1;
        this.shieldMultiplier = 1;
        this.healingMultiplier = 1;
        this.g1dmg = primaryWeapon.getDmg();
        this.g2dmg = secondaryWeapon.getDmg();

        /*----------------------- Levels --------------------------*/
        this.level = 1;
        this.miningSkill = 1;
        this.brewingSkill = 1;
        this.craftingSkill = 1;
        this.fightingSkill = 1;
        this.adventureSkill = 1;

        /*----------------------- Equipped --------------------------*/
        this.primaryWeapon = new Weapon(WeaponType.PRIMARY, Rarity.TRASH, 1, -1, 5, 1, -1);
        this.secondaryWeapon = null;
        this.helmet = null;
        this.chestplate = null;
        this.leggins = null;
        this.boots = null;

        /*----------------------- Inventory --------------------------*/
        this.items = new Item[30];
        this.status = "idle";
        this.location = "City Center";

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEmeralds() {
        return emeralds;
    }

    public void setEmeralds(int emeralds) {
        this.emeralds = emeralds;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHealthRegen() {
        return healthRegen;
    }

    public void setHealthRegen(int healthRegen) {
        this.healthRegen = healthRegen;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public int getCritDamage() {
        return critDamage;
    }

    public void setCritDamage(int critDamage) {
        this.critDamage = critDamage;
    }

    public int getMaxShield() {
        return maxShield;
    }

    public void setMaxShield(int maxShield) {
        this.maxShield = maxShield;
    }

    public int getDamageMultiplier() {
        return damageMultiplier;
    }

    public void setDamageMultiplier(int damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }

    public int getDefenceMultiplier() {
        return defenceMultiplier;
    }

    public void setDefenceMultiplier(int defenceMultiplier) {
        this.defenceMultiplier = defenceMultiplier;
    }

    public int getShieldMultiplier() {
        return shieldMultiplier;
    }

    public void setShieldMultiplier(int shieldMultiplier) {
        this.shieldMultiplier = shieldMultiplier;
    }

    public int getHealingMultiplier() {
        return healingMultiplier;
    }

    public void setHealingMultiplier(int healingMultiplier) {
        this.healingMultiplier = healingMultiplier;
    }

    public int getG1dmg() {
        return g1dmg;
    }

    public void setG1dmg(int g1dmg) {
        this.g1dmg = g1dmg;
    }

    public int getG2dmg() {
        return g2dmg;
    }

    public void setG2dmg(int g2dmg) {
        this.g2dmg = g2dmg;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getMiningSkill() {
        return miningSkill;
    }

    public void setMiningSkill(int miningSkill) {
        this.miningSkill = miningSkill;
    }

    public int getBrewingSkill() {
        return brewingSkill;
    }

    public void setBrewingSkill(int brewingSkill) {
        this.brewingSkill = brewingSkill;
    }

    public int getCraftingSkill() {
        return craftingSkill;
    }

    public void setCraftingSkill(int craftingSkill) {
        this.craftingSkill = craftingSkill;
    }

    public int getFightingSkill() {
        return fightingSkill;
    }

    public void setFightingSkill(int fightingSkill) {
        this.fightingSkill = fightingSkill;
    }

    public int getAdventureSkill() {
        return adventureSkill;
    }

    public void getAdventureSkill(int adventureSkill) {
        this.adventureSkill = adventureSkill;
    }

    public Weapon getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(Weapon primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public Weapon getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public void setSecondaryWeapon(Weapon secondaryWeapon) {
        this.secondaryWeapon = secondaryWeapon;
    }

    public Armor getHelmet() {
        return helmet;
    }

    public void setHelmet(Armor helmet) {
        this.helmet = helmet;
    }

    public Armor getChestplate() {
        return chestplate;
    }

    public void setChestplate(Armor chestplate) {
        this.chestplate = chestplate;
    }

    public Armor getLeggins() {
        return leggins;
    }

    public void setLeggins(Armor leggins) {
        this.leggins = leggins;
    }

    public Armor getBoots() {
        return boots;
    }

    public void setBoots(Armor boots) {
        this.boots = boots;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
