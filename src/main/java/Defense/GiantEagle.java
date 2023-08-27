package Defense;

import Characters.Bad.Enemy;

public class GiantEagle extends Defender {


    public GiantEagle(String name) {
        super(name);
    }

    @Override
    public void defend(Enemy enemy) {
        enemy.takeDamage(50);

    }
}
