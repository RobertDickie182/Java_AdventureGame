package Weapons;

import Characters.Bad.Enemy;

public class Axe extends Weapon {


    public Axe(String name) {
        super(name);
    }


    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(25);

    }
}
