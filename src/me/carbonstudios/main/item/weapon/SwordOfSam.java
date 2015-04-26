package me.carbonstudios.main.item.weapon;

import me.carbonstudios.main.item.Item;

/**
 * THIS CODE MAY BE LICENSED AND/OR COPYRIGHTED BY CARBON STUDIOS.
 * <p/>
 * FILE CREATED ON 4/25/2015 at 8:47 PM
 */
public class SwordOfSam implements Weapon {
    @Override
    public boolean canBeCrafted() {
        return false;
    }
    public Item.BonusList bonus() {
        return BonusList.FORTYTWO;
    }
}
