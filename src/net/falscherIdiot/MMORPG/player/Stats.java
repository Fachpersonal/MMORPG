package net.falscherIdiot.MMORPG.player;

import net.falscherIdiot.MMORPG.util.items.Rarity;
import net.falscherIdiot.MMORPG.util.items.WeaponType;

public class Stats {

    /*----------------------- Player --------------------------*/
    private String username;
    private int bitcoins;

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
    private int g3dmg;

    /*----------------------- Levels --------------------------*/
    private int level;
    private int exp; // EXP:[----------](63/17724)
    private int printingRank;// EXP:[----------](766/8378)
    private int medicalScience;// EXP:[|||||||||-](6093/6094)
    private int ammoCrafting;// EXP:[----------](174/8378)
    private int scavengeSkill;// EXP:[|||||||||-](14528/14529)
    private int miningSkill;// EXP:[|||||||||-](14528/14529)

    /*----------------------- Equipped --------------------------*/
    private Weapon primaryWeapon;
    private Weapon specialWeapon;
    private Weapon destructiveWeapon;
    private Armor helmet;
    private Armor upperArmor;
    private Armor lowerArmor;
    private Armor boots;

    /*----------------------- Inventory --------------------------*/
    private Item[] items;

    private String status;
    private String location;

    public Stats(String username) {
        /*----------------------- Player --------------------------*/
        this.username = username;
        this.bitcoins = 0;

        /*----------------------- Stats --------------------------*/
        this.maxHealth = 12;
        this.armor = 0;
        this.healthRegen = 0;
        this.dmg = 5;
        this.critChance = 0;
        this.critDamage = 0;
        this.maxShield = 0;
        this.damageMultiplier = 1;
        this.defenceMultiplier = 1;
        this.shieldMultiplier = 1;
        this.healingMultiplier = 1;
        this.g1dmg = primaryWeapon.getDmg();
        this.g2dmg = specialWeapon.getDmg();
        this.g3dmg = destructiveWeapon.getDmg();

        /*----------------------- Levels --------------------------*/
        this.level = 1;
        this.printingRank = 1;
        this.medicalScience = 1;
        this.ammoCrafting = 1;
        this.scavengeSkill = 1;
        this.miningSkill = 1;

        /*----------------------- Equipped --------------------------*/
        this.primaryWeapon = new Weapon(WeaponType.PRIMARY, Rarity.TRASH, 1, 25, 5, 1, 1);
        this.specialWeapon = null;
        this.destructiveWeapon = null;

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

    public int getBitcoins() {
        return bitcoins;
    }

    public void setBitcoins(int bitcoins) {
        this.bitcoins = bitcoins;
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

    public int getG3dmg() {
        return g3dmg;
    }

    public void setG3dmg(int g3dmg) {
        this.g3dmg = g3dmg;
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

    public int getPrintRank() {
        return printingRank;
    }

    public void setPrintRank(int printingRank) {
        this.printingRank = printingRank;
    }

    public int getMedicalScience() {
        return medicalScience;
    }

    public void setMedicalScience(int medicalScience) {
        this.medicalScience = medicalScience;
    }

    public int getAmmoCrafting() {
        return ammoCrafting;
    }

    public void setAmmoCrafting(int ammoCrafting) {
        this.ammoCrafting = ammoCrafting;
    }

    public int getScavengeSkill() {
        return scavengeSkill;
    }

    public void setScavengeSkill(int scavengeSkill) {
        this.scavengeSkill = scavengeSkill;
    }

    public int getMiningSkill() {
        return miningSkill;
    }

    public void setMiningSkill(int miningSkill) {
        this.miningSkill = miningSkill;
    }

    public Weapon getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(Weapon primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public Weapon getSpecialWeapon() {
        return specialWeapon;
    }

    public void setSpecialWeapon(Weapon specialWeapon) {
        this.specialWeapon = specialWeapon;
    }

    public Weapon getDestructiveWeapon() {
        return destructiveWeapon;
    }

    public void setDestructiveWeapon(Weapon destructiveWeapon) {
        this.destructiveWeapon = destructiveWeapon;
    }

    public Armor getHelmet() {
        return helmet;
    }

    public void setHelmet(Armor helmet) {
        this.helmet = helmet;
    }

    public Armor getUpperArmor() {
        return upperArmor;
    }

    public void setUpperArmor(Armor upperArmor) {
        this.upperArmor = upperArmor;
    }

    public Armor getLowerArmor() {
        return lowerArmor;
    }

    public void setLowerArmor(Armor lowerArmor) {
        this.lowerArmor = lowerArmor;
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
