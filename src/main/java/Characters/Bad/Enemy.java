package Characters.Bad;

import Characters.Good.Fighter;
import Characters.Good.Mage;
import Characters.Good.Player;

public abstract class Enemy implements IEnemyAttack {

    private int enemyHealth;

    public Enemy(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public String takeDamage(int damage) {
        this.enemyHealth -= damage;
        if (this.enemyHealth <= 0) {
            return "This enemy has been vanquished";
        }
        return "The enemy is wounded";
    }

//    @Override
//    public void enemyAttack(Player player) {
//
//    }
}
