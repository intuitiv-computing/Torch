package me.carbonstudios.main.player;

import java.util.Random;

public class Attack {
    Player player = new Player();
    Random random = new Random();
    public boolean isCriticalHit() {
        if((player.getDexterity() / 10) + random.nextInt(5) > 5)
        {
            return true;
        }
        return false;
    }
    public int damage() {
        if(isCriticalHit()) {
            return player.getDexterity();
        }
        return 6;
    }
}
