package me.carbonstudios.main.item.weapon;

/**
 * Created by Sam on 3/19/2015.
 */
public class Bow implements Weapon {
    Ammunition Arrow = new Ammunition() {
        @Override
        public int maxStack() {
            return 64;
        }

        @Override
        public String[] weaponFiredFrom() {
            return new String[] {"Bow"};
        }
    ;
    public String name() { return ""; }
    public int id() { return 2; }
    public int damage() {
        return (Arrow.damage() + 6);
    }};}

