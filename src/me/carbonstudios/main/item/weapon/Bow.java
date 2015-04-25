package me.carbonstudios.main.item.weapon;

/**
 * THIS CODE MAY BE LICENSED AND/OR COPYRIGHTED BY CARBON STUDIOS.
 *
 * FILE CREATED ON 3/19/2015 at 6:41 AM
 */
public class Bow implements Weapon {
        public int maxStack() {
            return 64;
        }

        public String[] weaponFiredFrom() {
            return new String[] {"Bow"};
        }
    public String name() { return ""; }
    public int id() { return 2; }
    public int damage() {
        return /*(arrow.damage() + 6);*/ 0;
    }

    public boolean canBeCrafted() {
        return true;
    }
}

