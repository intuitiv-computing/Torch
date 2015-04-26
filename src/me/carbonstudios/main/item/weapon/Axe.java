package me.carbonstudios.main.item.weapon;

/**
 * THIS CODE MAY BE LICENSED AND/OR COPYRIGHTED BY CARBON STUDIOS.
 * <p/>
 * FILE CREATED ON 4/25/2015 at 8:41 PM
 */
public class Axe implements Weapon {
    @Override
    public boolean canBeCrafted() {
        return true;
    }
    public int id() {
        return 6;
    }
    public String name() {
        return "Axe";
    }
}
