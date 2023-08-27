package Weapons;

import Characters.Bad.Enemy;

public class Sword extends Weapon {
    public Sword(String name) {
        super(name);
    }


    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(15);


    }


}
