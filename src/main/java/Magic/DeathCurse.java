package Magic;

import Characters.Bad.Enemy;

public class DeathCurse extends Spell{


    @Override
    public void cast(Enemy enemy) {
        enemy.takeDamage(50);

    }
}
