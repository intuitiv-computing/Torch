package me.carbonstudios.main.item.weapon;

import me.carbonstudios.main.item.Item;

import java.util.List;

public interface Weapon extends Item {
    public int id = 0;
    public int damage = 0;
    public List<String> bonus = null;
    public String name = "Weapon";
    /**0 - Melee, 1 - Ranged, 2 - Magic*/
    public int type = 0;

}
