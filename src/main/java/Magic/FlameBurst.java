package Magic;

import Characters.Bad.Enemy;

public class FlameBurst extends Spell {




    @Override
    public void cast(Enemy enemy) {
        enemy.takeDamage(30);

    }
}
