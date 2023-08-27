package Characters.Good;

import Characters.Bad.Enemy;
import Weapons.IWeapon;


public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, int playerHealth, IWeapon weapon) {
        super(name, playerHealth);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }


    public void attack(Enemy enemy) {
        weapon.attack(enemy);
    }

}
