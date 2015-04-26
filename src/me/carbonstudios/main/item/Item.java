package me.carbonstudios.main.item;

import com.sun.istack.internal.Nullable;

/**
 * THIS CODE MAY BE LICENSED AND/OR COPYRIGHTED BY CARBON STUDIOS.
 *
 * FILE CREATED ON 3/19/2015 at 6:39 AM
 */
public interface Item {
    /**
     * Defines an item's name.
     * Change this; defaults to "GenericItem"
     */
    public String name = "GenericItem";
    /**
     * Defines an item ID.
     * Must <b>NOT</b> be equal to <b>0</b>.
     */
    public int id = 0;
    /**
     * Gets an item's craft-ability.
     * @return true if the item can be crafted, otherwise false.
     * Implemented in {@link me.carbonstudios.main.crafting.ItemCraftable}
     */
    public boolean canBeCrafted();
    public enum BonusList {
        SLOW,

        FAST,

        BIG,

        DAMAGE,

        HARD,

        INTREPID,

        FORTYTWO
    }
}
