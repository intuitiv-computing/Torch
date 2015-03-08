package me.carbonstudios.main.weapon;

import com.sun.istack.internal.NotNull;

import java.util.List;

public interface Weapon {
    public int id = 0;
    public int damage = 0;
    public List<String> bonus = null;
    public String name = "Weapon";
    /**0 - Melee, 1 - Ranged, 2 - Magic*/
    public int type = 0;

}
