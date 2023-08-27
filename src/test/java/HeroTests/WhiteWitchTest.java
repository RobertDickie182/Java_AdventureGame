package HeroTests;

import Characters.Bad.Enemy;
import Characters.Bad.Orc;
import Characters.Good.Mage;
import Characters.Good.WhiteWitch;
import Defense.DireWolf;
import Defense.IDefend;
import Magic.Freeze;
import Magic.ISpell;
import org.junit.Before;

public class WhiteWitchTest {

    Mage whiteWitch;
    Enemy enemy;

    ISpell freeze;

    IDefend direWolf;

    @Before public void before(){
        freeze = new Freeze();
        direWolf = new DireWolf("Shadow");
        enemy = new Orc(50);
        whiteWitch = new WhiteWitch("Marlene", 100, freeze, direWolf);

    }
}

