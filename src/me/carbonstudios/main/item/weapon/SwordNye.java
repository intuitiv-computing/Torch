package me.carbonstudios.main.item.weapon;

/**
 * THIS CODE MAY BE LICENSED AND/OR COPYRIGHTED BY CARBON STUDIOS.
 *
 * FILE CREATED ON 3/8/2015 at 6:40 AM
 */
public class SwordNye implements Weapon {
    public int id() {
        return 2;
    }
    public String name()
    {
        return "Sword of Nye";
    }

    @Override
    public boolean canBeCrafted() {
        return true;
    }
}
