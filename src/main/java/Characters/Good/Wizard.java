package Characters.Good;

import Characters.Bad.Enemy;
import Defense.IDefend;
import Magic.ISpell;

public class Wizard extends Mage {


    public Wizard(String name, int playerHealth, ISpell spell, IDefend defender) {
        super(name, playerHealth, spell, defender);
    }

    @Override
    public void defend(Enemy enemy) {

    }

}
