package Weapons;

public abstract class Weapon implements IWeapon {

    public String name;


    public Weapon(String name) {
        this.name = name;
    }

    public String getWeaponName() {
        return name;
    }


}
