package Characters.Bad;

import Characters.Good.Dwarf;
import Characters.Good.Player;

public class Orc extends Enemy {
    public Orc(int enemyHealth) {
        super(enemyHealth);
    }

    public void attack(Player player) {
        player.takeDamage(20);
    }
}
