package Magic;

import Characters.Bad.Enemy;

public class Freeze extends Spell {




    @Override
    public void cast(Enemy enemy) {
        enemy.takeDamage(20);

    }
}
