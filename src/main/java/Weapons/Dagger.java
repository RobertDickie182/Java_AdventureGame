package Weapons;

import Characters.Bad.Enemy;

public class Dagger extends Weapon {


    public Dagger(String name) {
        super(name);
    }


    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(5);

    }
}
