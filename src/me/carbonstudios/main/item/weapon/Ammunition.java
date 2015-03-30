package me.carbonstudios.main.item.weapon;

import com.sun.istack.internal.Nullable;
import me.carbonstudios.main.item.Item;

/**
 * Created by Sam on 3/19/2015.
 */
public interface Ammunition extends Item {
    public int maxStack();
    @Nullable
    public String[] weaponFiredFrom();
    public int damage();
}
