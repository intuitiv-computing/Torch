package me.carbonstudios.main.crafting;

import me.carbonstudios.main.item.Item;

/**
 * THIS CLASS IS NOW <b>DEPRECATED</b>!
 *
 * USE <code>{@link me.carbonstudios.main.item.Item}.canBeCrafted</code>
 */
@Deprecated
public class ItemCraftable {
    /**
     * /**
     * THIS CLASS IS NOW <b>DEPRECATED</b>!
     *
     * USE <code>{@link me.carbonstudios.main.item.Item}.canBeCrafted</code>
     *
     * @param craftable
     * @return can be crafted?
     */
    @Deprecated
    public boolean isItemCraftable(Item craftable) {
        if (craftable.canBeCrafted()) {
            return true;
        } else {
            return false;
        }
    }
}
