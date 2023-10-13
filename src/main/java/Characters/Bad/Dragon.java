package Characters.Bad;

import Characters.Good.Knight;
import Characters.Good.Player;

public class Dragon extends Enemy {
    public Dragon(int enemyHealth) {
        super(enemyHealth);
    }

    public void enemyAttack(Player player) {
        player.takeDamage(50);
    }
}
