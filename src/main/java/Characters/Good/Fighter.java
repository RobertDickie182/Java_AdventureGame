package Characters.Good;

import Weapons.IWeapon;


public abstract class Fighter extends Player implements IWeapon {

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


}
