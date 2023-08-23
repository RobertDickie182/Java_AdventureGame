package Defense;

public abstract class Defender implements IDefend {

    public String name;

    public int hitDamage;

    public Defender(String name, int hitDamage) {
        this.name = name;
        this.hitDamage = hitDamage;
    }

    public String getName() {
        return name;
    }

    public int getHitDamage() {
        return hitDamage;
    }
}
