package me.carbonstudios.main.item.utility;

import me.carbonstudios.main.item.Item;

/**
 * THIS CODE MAY BE LICENSED AND/OR COPYRIGHTED BY CARBON STUDIOS.
 *
 * FILE CREATED ON 4/12/2015 at 6:41 AM
 */
public class CraftingTable implements Item {
    public int id() {
        return 6;
    }
    public String name() {
        return "Crafting Table";
    }
    public boolean canBeCrafted() {
        return true;
    }
}