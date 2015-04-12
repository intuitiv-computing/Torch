package me.carbonstudios.main.item.weapon;

import me.carbonstudios.main.*;

import java.util.List;

public class Tomahawk implements Weapon {
    public int id() {
        return 3;
    }
    public int damage() {
        return 3;
    }
    public List<String> bonus() {
        return null;
    }
    public String name() {
        return "Tomahawk";
    }
    public int type() {
        return 1;
    }

    @Override
    public boolean canBeCrafted() {
        return false;
    }
}
