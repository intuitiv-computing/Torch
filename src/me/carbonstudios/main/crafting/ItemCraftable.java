package me.carbonstudios.main.crafting;

import me.carbonstudios.main.item.Item;

/**
 * Created by Sam on 4/12/2015.
 */
@Deprecated
public class ItemCraftable {

    public boolean isItemCraftable(Item craftable) {
        if (craftable.canBeCrafted()) {
            return true;
        } else {
            return false;
        }
    }
}
