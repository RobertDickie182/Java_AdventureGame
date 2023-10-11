package Magic;

import Characters.Bad.Enemy;

public class Freeze extends Spell {

    public Freeze() {
    }



    @Override
    public void cast(Enemy enemy) {
        enemy.takeDamage(20);

    }
}
