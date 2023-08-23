package Magic;

public abstract class Spell implements ISpell {

    private String name;

    private int magicDamage;

    public Spell(String name, int magicDamage) {
        this.name = name;
        this.magicDamage = magicDamage;
    }

    public String getName() {
        return name;
    }

    public int getMagicDamage() {
        return magicDamage;
    }
}
