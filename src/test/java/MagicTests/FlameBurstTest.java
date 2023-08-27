package MagicTests;

import Characters.Bad.Enemy;
import Characters.Bad.Orc;
import Magic.FlameBurst;
import Magic.ISpell;
import org.junit.Before;
import org.junit.Test;

public class FlameBurstTest {

    ISpell flameBurst;
    Enemy enemy;

    @Before
    public void before(){
        flameBurst = new FlameBurst();
        enemy = new Orc(50);
    }

    @Test
    public void canCastSpell(){
        flameBurst.cast(enemy);

    }
}
