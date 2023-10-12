package Characters.Good;

import Characters.Good.Player;
import Healing.IHeal;

public class Cleric extends Player implements IHeal {

    IHeal healingObject;

    public Cleric(String name, int playerHealth, IHeal healingObject) {
        super(name, playerHealth);
        this.healingObject = healingObject;
    }

    public IHeal getHealingObject() {
        return healingObject;
    }

    public void setHealingObject(IHeal healingObject) {
        this.healingObject = healingObject;
    }

    @Override
    public void heal(Player player) {
        healingObject.heal(player);

    }
}
