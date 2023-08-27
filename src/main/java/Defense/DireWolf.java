package Defense;

import Characters.Bad.Enemy;

public class DireWolf extends Defender {


    public DireWolf(String name) {
        super(name);
    }

    @Override
    public void defend(Enemy enemy) {
        enemy.takeDamage(20);
    }
}
