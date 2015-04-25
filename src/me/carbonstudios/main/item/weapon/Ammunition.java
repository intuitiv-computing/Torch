package me.carbonstudios.main.item.weapon;

import com.sun.istack.internal.Nullable;
import me.carbonstudios.main.item.Item;

/**
 * THIS CODE MAY BE LICENSED AND/OR COPYRIGHTED BY CARBON STUDIOS.
 *
 * FILE CREATED ON 3/19/2015 at 6:41 AM
 */
public interface Ammunition extends Item {
    public int maxStack();
    @Nullable
    public Item[] weaponFiredFrom();
    public int damage();
    public boolean canBeCrafted();
}
