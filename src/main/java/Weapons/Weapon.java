package Weapons;

public abstract class Weapon implements IWeapon {

    public String name;

    public int damagePoints;

    public Weapon(String name, int damagePoints) {
        this.name = name;
        this.damagePoints = damagePoints;
    }

    public String getName() {
        return name;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

}
