package Characters.Good;

import Defense.IDefend;
import Magic.ISpell;



public abstract class Mage extends Player implements ISpell, IDefend {

    private ISpell spell;
    private IDefend defend;

    public Mage(String name, int playerHealth) {
        super(name, playerHealth);
    }




}
