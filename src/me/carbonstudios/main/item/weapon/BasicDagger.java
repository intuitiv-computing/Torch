package me.carbonstudios.main.item.weapon;

import java.util.List;

public class BasicDagger implements Weapon {
    public int id() {
        return 1;
    }
    public String name() {
        return "Plain Dagger";
    }
    public List<String> bonus() {
        return null;
    }
    public int damage() {
        return 2;
    }
    public int type() {
        return 0;
    }
}