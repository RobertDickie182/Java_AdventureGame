package Characters.Good;

import Characters.Bad.Enemy;
import Defense.IDefend;
import Magic.ISpell;

public class WhiteWitch extends Mage {


    public WhiteWitch(String name, int playerHealth, ISpell spell, IDefend defender) {
        super(name, playerHealth, spell, defender);
    }

    @Override
    public void defend(Enemy enemy) {

    }

    @Override
    public void cast(Enemy enemy) {

    }
}
