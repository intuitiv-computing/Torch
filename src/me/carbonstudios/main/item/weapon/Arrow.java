package me.carbonstudios.main.item.weapon;

import me.carbonstudios.main.item.Item;

/**
 * THIS CODE MAY BE LICENSED AND/OR COPYRIGHTED BY CARBON STUDIOS.
 * <p/>
 * FILE CREATED ON 4/25/2015 at 6:37 AM
 */
public class Arrow implements Item {
    public int id() {
        return 10;
    }
    public String name() {
        return "Arrow";
    }
    public boolean canBeCrafted() {
        return false;
    }
}
