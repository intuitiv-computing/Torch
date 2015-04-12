package me.carbonstudios.main.item.weapon;

import me.carbonstudios.main.item.Item;

/**
 * Created by Sam on 4/12/2015.
 */
public abstract class UpgradeBow {
    public int oldId() {
        return Crafting().inputId();
    }
}
