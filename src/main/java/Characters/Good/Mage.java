package Characters.Good;

import Magic.ISpell;

public abstract class Mage extends Player implements ISpell {
    public Mage(String name, int playerHealth) {
        super(name, playerHealth);
    }


}
