package Characters.Bad;

import Characters.Good.Player;

public class Troll extends Enemy {
    public Troll(int enemyHealth) {
        super(enemyHealth);
    }

    public void enemyAttack(Player player) {
        player.takeDamage(25);
    }
}
