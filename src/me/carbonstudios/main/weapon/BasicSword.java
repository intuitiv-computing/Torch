package me.carbonstudios.main.weapon;

import java.util.List;
import me.carbonstudios.main.weapon.Weapon;

public class BasicSword implements Weapon {
    public int id() {
        return 1;
    }
    public String name() {
        return "Basic Sword";
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
