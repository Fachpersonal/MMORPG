package net.falscherIdiot.MMORPG.player;

import net.falscherIdiot.MMORPG.util.items.Rarity;

public abstract class Item {
    private Rarity rarity;

    private int amount;
    private int price;

    public Item(Rarity rarity, int level, int durability, int amount, int price) {
        this.rarity = rarity;
        this.amount = amount;
        this.price = price;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

}
