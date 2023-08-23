package Characters.Good;

import Defense.IDefend;
import Magic.ISpell;



public abstract class Mage extends Player implements ISpell, IDefend {

    private ISpell spell;
    private IDefend defender;

    public Mage(String name, int playerHealth, ISpell spell, IDefend defender) {
        super(name, playerHealth);
        this.spell = spell;
        this.defender = defender;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void setDefend(IDefend defend) {
        this.defender = defend;
    }
}
