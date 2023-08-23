package Characters.Bad;

public abstract class Enemy {

    private int enemyHealth;

    public Enemy(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }
}
