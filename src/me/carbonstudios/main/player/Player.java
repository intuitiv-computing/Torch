package me.carbonstudios.main.player;

import me.carbonstudios.main.item.Item;

import java.util.List;

public class Player {
    // Below are the player's attributes.
    private static String name;
    private int health;
    private static int maxHealth;
    private static int charisma;
    private static int strength;
    private static int intelligence;
    private static int dexterity;
    private static int stamina;

    public static int getStamina() {
        return stamina;
    }

    public static void setStamina(int stamina) {
        Player.stamina = stamina;
    }

    public static int getDexterity() {
        return dexterity;
    }

    public static int getStrength() {
        return strength;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Player.name = name;
    }

    public static int weaponId = 0;

    public static List<Item[]> inventory;

    public static List<Item[]> getInventory() {
        return inventory;
    }

}