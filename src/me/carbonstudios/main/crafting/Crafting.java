package me.carbonstudios.main.crafting;

import me.carbonstudios.main.item.Item;
import me.carbonstudios.main.player.Player;

/**
 * THIS CODE MAY BE LICENSED AND/OR COPYRIGHTED BY SAM OR CARBON STUDIOS
 *
 * CREATED: 4/12/2015 AT 6:44 PM
 */
public abstract class Crafting {
    public void craft(Item[] materials, Item output)
    {
        if(output.canBeCrafted()) {
            if(Player.getInventory().contains(materials)) {
                Player.getInventory().remove(materials);
                Player.getInventory().add(output);
            } else {
                System.out.println("Insufficient materials to make that item.");
            }
        } else {
            System.out.println("Can't. Craft. This.");
        }
    }
}
