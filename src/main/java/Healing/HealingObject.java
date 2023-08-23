package Healing;

public abstract class HealingObject implements IHeal {

    private String name;

    private int healingValue;

    public HealingObject(String name, int healingValue) {
        this.name = name;
        this.healingValue = healingValue;
    }

    public String getName() {
        return name;
    }

    public int getHealingValue() {
        return healingValue;
    }
}
