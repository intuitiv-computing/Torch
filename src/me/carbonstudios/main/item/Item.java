package me.carbonstudios.main.item;

import com.sun.istack.internal.NotNull;

import java.util.List;

/**
 * Created by Sam on 3/19/2015.
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
}
