package Healing;

import Characters.Good.Player;

public class Potion extends HealingObject {


    public Potion(String name, int healingValue) {
        super(name, healingValue);
    }

    @Override
    public void heal(Player player) {
        player.playerHeal(80);

    }
}
