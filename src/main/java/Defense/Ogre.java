package Defense;

import Characters.Bad.Enemy;

public class Ogre extends Defender {


    public Ogre(String name) {
        super(name);
    }

    @Override
    public void defend(Enemy enemy) {
        enemy.takeDamage(50);

    }
}
